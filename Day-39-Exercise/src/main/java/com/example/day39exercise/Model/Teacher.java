package com.example.day39exercise.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "name cannot be empty")
    @Column(columnDefinition = "varchar (25) not null")
    private String name;

    @NotNull(message = "age cannot be empty")
    @Column(columnDefinition = "int not null")
    @Min(value = 18, message = "age cannot be less than 18")
    private Integer age;

    @NotEmpty(message = "email cannot be empty")
    @Column(columnDefinition = "varchar (25) not null")
    @Email(message = "email must be a valid format")
    private String email;

    @NotNull(message = "salary cannot be empty")
    @Column(columnDefinition = "double not null")
    @Positive(message = "salary must a positive number")
    private Double salary;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Address address;



}
