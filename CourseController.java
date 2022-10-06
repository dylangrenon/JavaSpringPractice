package com.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseController {

		//Course: id, name, author
		public List<Course> retirveAllCourses() {
			return Arrays.asList(
					new Course(1, "Learn AWS", "Dylan"),
					new Course(1, "Learn AWS", "Dylan")
					
					);	
		}
	
}
