package com.example.mybackend.service;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "etudiant", schema = "public", catalog = "exercice")
public class EtudiantEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "age")
    private Integer age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtudiantEntity that = (EtudiantEntity) o;
        return id == that.id && Objects.equals(nom, that.nom) && Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, age);
    }
}
