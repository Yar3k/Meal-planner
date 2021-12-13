package main.mealplanner.model;

import javax.persistence.*;

//@Entity
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)

    private long id;
    private String name;

    public User() {
    }

    public String toString() {
        return "User with id = " + this.id + " and with name = " + this.name;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
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

}
