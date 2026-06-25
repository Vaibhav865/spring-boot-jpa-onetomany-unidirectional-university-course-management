package com.proj.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.proj.entity.Course;
import com.proj.entity.University;
import com.proj.service.UniversityCourseService;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private UniversityCourseService s;
	
	@Override
	public void run(String... args) throws Exception {
		s.saveUniversity( new University("Sandip University" , "Nashik", 
				Arrays.asList(new  Course("CSE","4 Years",110000D),
							  new Course("DevOps", "4 years" , 10000D)
						  	 )
				));
		
		s.saveUniversity( new University("DY Patil University" , "Pune", 
				Arrays.asList(new  Course("B tech CSE","4 Years",110000D),
						new Course("Cloude", "4 years" , 10000D)
						)
				));
		
		s.showAllUniversity().forEach(IO::println);		
	}

}









