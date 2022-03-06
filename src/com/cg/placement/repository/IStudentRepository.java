package com.cg.placement.repository;

import com.cg.placement.entities.Student;

public interface IStudentRepository {
    public Student addStudent(Student student);
    public Student updateStudent(Student student);
    public Student searchStudentById(int id);
    public Student searchStudentByHallTicketNo(int hallTicketNo);
    public Student deleteStudent(Student student);

    public abstract void beginTransaction();
    public abstract void commitTransaction();
    void deleteStudent(int id);

}
