package com.example.demo.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Employee {

    private String firstName;

    private String lastName;

    @Id
    private String email;

    private Integer age;

    private Integer salary;
}
