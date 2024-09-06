package com.example.project2.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
@Entity
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size (min = 3, max = 15, message = "Имя должно быть больше или ровно 3 символа, но и не больше 15 символов")
    private String name;
    @Size (min = 5, max = 25, message = "Почта должна быть больше или ровно 5 символа, но и не больше 25 символов")
    private String email;
    // Геттеры и сеттеры
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
}