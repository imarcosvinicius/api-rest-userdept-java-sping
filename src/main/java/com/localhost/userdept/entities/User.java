package com.localhost.userdept.entities;

import javax.persistence.*;

@Entity // The @Entity annotation is used to indicate that a class is also an entity.
@Table(name = "tb_user") // The @Table annotation allows you to specify the details of the table that will
// be used to persist the entity in the database.
public class User {

    @Id //The I@Id annotation is used to inform JPA which field/attribute of an entity will be related
    // to the primary key of the respective table in the database.
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // The @GeneratedValue annotation is used to inform
    // that the entity's unique identifier value generation will be managed by the persistence provider.
    // This annotation should be added right after the @Id annotation.
    private Long id;
    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department; // entity association

    //Default constructor
    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
