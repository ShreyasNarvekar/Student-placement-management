package com.cg.placement.service;

import com.cg.placement.entities.College;
import com.cg.placement.repository.CollegeRepositoryImpl;
import com.cg.placement.repository.ICollegeRpository;

import javax.transaction.Transactional;

public class CollegeServiceImpl implements ICollegeService{

    private final ICollegeRpository dao;
    public CollegeServiceImpl(){
        dao=new CollegeRepositoryImpl();
    }

    @Override

    public College addCollege(College college) {
        dao.beginTransaction();
        dao.addCollege(college);
        dao.commitTransaction();
        return college;
    }

    @Override

    public College updateCollege(College college) {
        dao.beginTransaction();
        dao.updateCollege(college);
        dao.commitTransaction();
        return college;
    }

    @Override
    public College searchCollegeById(int id) {
        return dao.searchCollegeById(id);
    }

    @Override
    
    public College deleteCollege(int id) {
        College college=dao.searchCollegeById(id);
        dao.beginTransaction();
        dao.deleteCollege(id);
        dao.commitTransaction();
        return college;
    }
}
