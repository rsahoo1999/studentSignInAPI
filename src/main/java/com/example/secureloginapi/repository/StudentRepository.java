package com.example.secureloginapi.repository;

import com.example.secureloginapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // You can define custom query methods or use the default methods provided by JpaRepository
}

