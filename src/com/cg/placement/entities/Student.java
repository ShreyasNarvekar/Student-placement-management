package com.cg.placement.entities;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private int roll;
    private String qualification;
    private String courses;
    private int year;
    private int hallTicketNo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Certificate_id")
    private Certificate certificate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "College_id")
    private College college;


    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHallTicketNo() {
        return hallTicketNo;
    }

    public void setHallTicketNo(int hallTicketNo) {
        this.hallTicketNo = hallTicketNo;
    }




    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", college=" + college +
                ", roll=" + roll +
                ", qualification='" + qualification + '\'' +
                ", courses='" + courses + '\'' +
                ", year=" + year +
                ", hallTicketNo=" + hallTicketNo +
                ", certificate=" + certificate +
                '}';
    }

    public Student() {
        super();
    }

    public Student(int id, String name, int roll, String qualification, String courses, int year, int hallTicketNo, Certificate certificate, College college) {
        super();
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.qualification = qualification;
        this.courses = courses;
        this.year = year;
        this.hallTicketNo = hallTicketNo;
        this.certificate = certificate;
        this.college = college;
    }
}
