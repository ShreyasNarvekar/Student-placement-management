package com.cg.placement.repository;

import com.cg.placement.entities.Placement;

import javax.persistence.EntityManager;

public class PlacementRepositoryImpl implements IPlacementRepository{
    //  Step 1: Start JPA LifeCycle
    private EntityManager entityManager;
    public PlacementRepositoryImpl(){
        entityManager =JPAUtil.getEntityManager();
    }

    @Override
    public Placement addPlacement(Placement placement) {
        entityManager.persist(placement);
        return placement;

    }

    @Override
    public Placement updatePlacement(Placement placement) {
        entityManager.merge(placement);
        return placement;
    }

    @Override
    public Placement searchPlacement(int id) {
        return entityManager.find(Placement.class,id);
    }

    @Override
    public Placement cancelPlacement(int id) {
        Placement placement=entityManager.find(Placement.class,id);
        entityManager.remove(placement);
        return placement;
    }

    @Override
    public void beginTransaction() {
        entityManager.getTransaction().begin();
    }

    @Override
    public void commitTransaction() {
        entityManager.getTransaction().commit();
    }
}
