package com.example.brushupjpa.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name="student")
@Table(name="STUDENT", schema="SCHOOL")
public class Student extends BaseEntity {

    @Column(name="STUDENT_NAME", length=50, nullable = false, unique = false)
    private String name;

    @Transient
    private Integer age;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    public enum Gender {
        MALE,
        FEMALE
    }

}
