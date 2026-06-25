package com.proj.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name = "OneTOManyCourse")
@NoArgsConstructor
@RequiredArgsConstructor
public class Course {
	
	@Id
	@SequenceGenerator(sequenceName = "courseIdSqn" , name="courseIdSqn" , initialValue = 1 , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "courseIdSqn")
	@Column(length = 30)
	private Integer courseId;
	
	@Column(length = 30)
	@Nonnull
	private	String courseName ;
	
	@Column(length = 30)
	@Nonnull
	private String duration	;
	
	@Column(length = 30)
	@Nonnull
	private Double fees;
	
}
