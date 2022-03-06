package com.cg.placement.service;

import com.cg.placement.entities.Placement;
import com.cg.placement.repository.IPlacementRepository;
import com.cg.placement.repository.PlacementRepositoryImpl;

public class PlacementServiceImpl implements IPlacementService{

    private IPlacementRepository dao;
    public PlacementServiceImpl(){
        dao=new PlacementRepositoryImpl();
    }

    @Override
    public Placement addPlacement(Placement placement) {
        dao.beginTransaction();
        dao.addPlacement(placement);
        dao.commitTransaction();
        return placement;
    }

    @Override
    public Placement updatePlacement(Placement placement) {
        dao.beginTransaction();
        dao.updatePlacement(placement);
        dao.commitTransaction();
        return placement;
    }

    @Override
    public Placement searchPlacement(int id) {
        return dao.searchPlacement(id);
    }

    @Override
    public Placement cancelPlacement(int id) {
        dao.beginTransaction();
        dao.cancelPlacement(id);
        dao.commitTransaction();
        return dao.searchPlacement(id);
    }
}
