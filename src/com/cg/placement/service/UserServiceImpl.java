package com.cg.placement.service;

import com.cg.placement.entities.Admin;
import com.cg.placement.entities.User;
import com.cg.placement.repository.IUserRepository;
import com.cg.placement.repository.UserRepoImpl;

public class UserServiceImpl implements IUserService{
    private IUserRepository dao;
    public UserServiceImpl(){
        dao=new UserRepoImpl();
    }

    @Override
    public User addNewUser(User user) {
        dao.beginTransaction();
        dao.addNewUser(user);
        dao.commitTransaction();
        return user;
    }

    @Override
    public User updateUser(User user) {
        dao.beginTransaction();
        dao.updateUser(user);
        dao.commitTransaction();
        return user;
    }

    @Override
    public Admin addAdmin(Admin admin) {
        dao.beginTransaction();
        dao.addAdmin(admin);
        dao.commitTransaction();
        return admin;
    }


//    @Override
//    public User login(User user) {
//        dao.
//        return null;
//    }
}
