package com.example.secureloginapi.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "roll_no")
    private String rollNo;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "mobile_number")
    private String mobileNumber;
}

