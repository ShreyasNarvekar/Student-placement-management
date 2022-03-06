package com.cg.placement.repository;

import com.cg.placement.entities.Admin;
import com.cg.placement.entities.User;

import javax.persistence.EntityManager;

public class UserRepoImpl implements IUserRepository {
    //  Step 1: Start JPA LifeCycle
    private EntityManager entityManager;
    public UserRepoImpl(){
        entityManager =JPAUtil.getEntityManager();
    }

    @Override
    public User addNewUser(User user) {
        entityManager.persist(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        entityManager.merge(user);
        return user;
    }

    @Override
    public User deleteUser(int id) {
        User user =entityManager.find(User.class,id);
        entityManager.remove(user);
        return user;
    }

    @Override
    public Admin addAdmin(Admin admin) {
        entityManager.persist(admin);
        return admin;
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
