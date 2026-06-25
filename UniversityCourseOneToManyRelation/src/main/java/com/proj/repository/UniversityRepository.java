package com.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.entity.University;

public interface UniversityRepository extends JpaRepository<University, Integer> {

}
