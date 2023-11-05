package com.userdept.userdept.entities;
import jakarta.persistence.*;


@Entity
@Table (name = "tb_user")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String name;
        private Long id;
        private  String email;
        @ManyToOne
        @JoinColumn(name = "departament_id")
        private Departament departament;
        public User(){
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }
}
