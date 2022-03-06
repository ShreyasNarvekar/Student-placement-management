package com.cg.placement.repository;

import com.cg.placement.entities.Student;

import javax.persistence.EntityManager;

public class StudentRepositoryImpl implements IStudentRepository{
//  Step 1: Start JPA LifeCycle
    private final EntityManager entityManager;
    public StudentRepositoryImpl(){
        entityManager=JPAUtil.getEntityManager();
    }
    // Create operation - Repo/DAO
    @Override

    public Student addStudent(Student student) {
        entityManager.persist(student);
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        entityManager.merge(student);
        return student;
    }

    @Override
    public Student searchStudentById(int id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public Student searchStudentByHallTicketNo(int hallTicketNo) {
        return entityManager.find(Student.class,hallTicketNo);
    }

    @Override
    public Student deleteStudent(Student student) {
        entityManager.remove(student);
        return student;
    }

    @Override
    public void beginTransaction() {
        entityManager.getTransaction().begin();
    }

    @Override
    public void commitTransaction() {
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteStudent(int id) {
        Student student =entityManager.find(Student.class,id);
        entityManager.remove(student);
    }
}
