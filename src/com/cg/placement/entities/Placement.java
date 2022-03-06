package com.cg.placement.entities;

import javax.persistence.*;

@Entity
@Table(name = "placement")
public class Placement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String date;
    private String qualification;
    private int year;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="college_id")
    private College college;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Placement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", qualification='" + qualification + '\'' +
                ", year=" + year +
                ", college=" + college +
                '}';
    }

    public Placement() {
        super();
    }

    public Placement(int id, String name, String date, String qualification, int year, College college) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.qualification = qualification;
        this.year = year;
        this.college = college;
    }
}
