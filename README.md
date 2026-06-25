# spring-boot-jpa-onetomany-unidirectional-university-course-management
Spring Boot Data JPA project demonstrating Unidirectional One-to-Many mapping between University and Courses using @OneToMany, @JoinColumn, CascadeType.ALL, and Spring Data JPA.


University Course Management System

A Spring Boot Data JPA application that demonstrates a Unidirectional One-to-Many relationship between University and Course entities.

Project Overview

This project models a University Management System where a single university can offer multiple courses. The relationship is implemented using Spring Data JPA with a unidirectional One-to-Many mapping, allowing navigation only from the University entity to the Course entity.

Features
Spring Boot and Spring Data JPA integration
Unidirectional One-to-Many relationship
Foreign key management using @JoinColumn
Cascade operations using CascadeType.ALL
Repository layer using Spring Data JPA
Data retrieval and display using CommandLineRunner
Automatic persistence of related entities
Technologies Used
Java
Spring Boot
Spring Data JPA
Hibernate
MySQL
Maven
Relationship Mapping
One University can have multiple Courses
Navigation is possible only from University to Course
@OneToMany used in University entity
@JoinColumn used to create the foreign key in Course table
No @ManyToOne mapping in Course entity
Learning Outcomes
Understanding Unidirectional One-to-Many relationships
Implementing entity associations in JPA
Using CascadeType.ALL for automatic persistence
Managing foreign keys with @JoinColumn
Working with Spring Data JPA repositories
Sample Output

University Details

University Id: 101
University Name: Global University
City: Hyderabad

Course Details

Course Id: 1
Course Name: Java Full Stack
Duration: 6 Months
Fee: 25000.0
Course Id: 2
Course Name: Spring Boot
Duration: 3 Months
Fee: 15000.0
