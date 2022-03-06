package com.cg.placement.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "College")
public class College implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;

    @OneToMany(mappedBy = "college", cascade =  CascadeType.ALL)
    private List<Student> students;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    private List<Certificate> certificates;

    @OneToMany(mappedBy = "college",cascade = CascadeType.ALL)
    private List<Placement> placements;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Admin_id")
    private User Admin;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public List<Placement> getPlacements() {
        return placements;
    }

    public void setPlacements(List<Placement> placements) {
        this.placements = placements;
    }

    public User getAdmin() {
        return Admin;
    }

    public void setAdmin(User admin) {
        Admin = admin;
    }

    public College(){
        super();
    }

    public College(int id, String name, String location, List<Student> students, List<Certificate> certificates, List<Placement> placements, User admin) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.students = students;
        this.certificates = certificates;
        this.placements = placements;
        Admin = admin;
    }

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", students=" + students +
                ", certificates=" + certificates +
                ", placements=" + placements +
                ", Admin=" + Admin +
                '}';
    }
}
