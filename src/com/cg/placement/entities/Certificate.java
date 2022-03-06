package com.cg.placement.entities;

import javax.persistence.*;

@Entity
@Table(name = "Certificate")
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private int year;

    @ManyToOne
    @JoinColumn(name = "College_id")
    private College college;

   @OneToOne(mappedBy = "certificate")
   private Student student;

    public Student getStudent() {
        return student;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "id=" + id +
                ", year=" + year +
                ", college=" + college +
                ", student=" + student +
                '}';
    }

    public Certificate() {
        super();
    }

    public Certificate(int id, int year, College college, Student student) {
        super();
        this.id = id;
        this.year = year;
        this.college = college;
        this.student = student;
    }
}
