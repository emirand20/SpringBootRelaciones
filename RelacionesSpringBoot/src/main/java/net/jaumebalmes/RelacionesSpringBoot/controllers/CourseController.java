package net.jaumebalmes.RelacionesSpringBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.RelacionesSpringBoot.entitys.Course;
import net.jaumebalmes.RelacionesSpringBoot.entitys.CourseMaterial;
import net.jaumebalmes.RelacionesSpringBoot.repositoty.CourseRepository;

@RestController
@RequestMapping("api")
public class CourseController {
    
    @Autowired

	CourseRepository courseRepo;
	
	@GetMapping ("courseMaterial/{id}")
	public Course getCourse(@PathVariable long id) {
		
		return courseRepo.findById(id).get();
	}
	
	@GetMapping("course")
	public Iterable<Course> getCourses() {
		
		return courseRepo.findAll();
	}
}
