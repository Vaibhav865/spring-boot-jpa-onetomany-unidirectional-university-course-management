package com.proj.entity;

import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class University {
	
	@Id
	@SequenceGenerator(sequenceName = "universityIdSqn" , name = "universityIdSqn" , initialValue = 1 , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "universityIdSqn")
	@Column(length = 10)
	private Integer universityId;
	
	@Column(length = 30)
	@Nonnull
	private	String universityName;
	
	@Column(length = 30)
	@Nonnull
	private String city;
	
	@OneToMany( cascade = CascadeType.ALL,fetch =FetchType.EAGER)
	@JoinColumn(name = "universityId")
	@Nonnull
	private  List<Course> courses;
	
}
