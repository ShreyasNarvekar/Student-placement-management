package com.cg.placement.repository;

import com.cg.placement.entities.College;

public interface ICollegeRpository {
    public College addCollege(College college);
    public College updateCollege(College college);
    public College searchCollegeById(int id);
    public  College deleteCollege(int id);

    public abstract void beginTransaction();
    public abstract void commitTransaction();
}
