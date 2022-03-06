package com.cg.placement.repository;

import com.cg.placement.entities.College;

import javax.persistence.EntityManager;

public class CollegeRepositoryImpl implements ICollegeRpository{
    private final EntityManager entityManager;
    public CollegeRepositoryImpl(){
        entityManager=JPAUtil.getEntityManager();
    }

    @Override
    public College addCollege(College college) {
        entityManager.persist(college);
        return college;
    }

    @Override
    public College updateCollege(College college) {
        entityManager.merge(college);
        return college;
    }

    @Override
    public College searchCollegeById(int id) {
        return entityManager.find(College.class,id);
    }

    @Override
    public College deleteCollege(int id) {
        College college=entityManager.find(College.class,id);
        entityManager.remove(college);
        return college;
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
