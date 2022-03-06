package com.cg.placement.service;

import com.cg.placement.entities.College;

public interface ICollegeService {
    public College addCollege(College college);
    public College updateCollege(College college);
    public College searchCollegeById(int id);
    public  College deleteCollege(int id);
}
