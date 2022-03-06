package com.cg.placement.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.security.PrivateKey;
import java.util.List;

@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String type;
    private String password;

    @OneToOne(mappedBy = "user")
    private Admin admin;

    @OneToOne(mappedBy = "Admin")
    private  College college;


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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public User(int id, String name, String type, String password, College college, Admin admin) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
        this.password = password;
        this.college = college;
        this.admin = admin;
    }

    public User() {
        super();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", password='" + password + '\'' +
                ", college=" + college +
                ", admin=" + admin +
                '}';
    }
}
