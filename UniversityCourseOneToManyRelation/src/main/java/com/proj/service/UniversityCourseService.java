package com.proj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.entity.University;
import com.proj.repository.UniversityRepository;


@Service
public class UniversityCourseService {
		@Autowired
		private UniversityRepository r;
		
		public void saveUniversity(University u) {
			r.save(u);
		}
		
		public List<University> showAllUniversity(){
			return r.findAll();
		}
	
}
