package com.example.secureloginapi.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class StudentDTO {
    private Long id;
    @NotBlank(message = "Name is required")
    private String name;

    private int age;

    @NotBlank(message = "Email address is required")
    @Email(message = "Invalid email address")
    private String emailAddress;

    @NotBlank(message = "Roll number is required")
    private String rollNo;

    @NotBlank(message = "School name is required")
    private String schoolName;

    @NotBlank(message = "Mobile number is required")
    @Size(min = 10, max = 10, message = "Mobile number should be 10 digits")
    private String mobileNumber;
}

