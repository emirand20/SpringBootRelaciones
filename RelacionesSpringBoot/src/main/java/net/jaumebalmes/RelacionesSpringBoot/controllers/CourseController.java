package net.jaumebalmes.RelacionesSpringBoot.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.RelacionesSpringBoot.entitys.Course;
import net.jaumebalmes.RelacionesSpringBoot.entitys.CourseMaterial;
import net.jaumebalmes.RelacionesSpringBoot.error.apiError;
import net.jaumebalmes.RelacionesSpringBoot.repositoty.CourseMaterialRepository;
import net.jaumebalmes.RelacionesSpringBoot.repositoty.CourseRepository;

@RestController
@RequestMapping("api")
public class CourseController {
    
    @Autowired
	CourseRepository courseRepo;
	CourseMaterialRepository cursosMaterialRep;
	
	@GetMapping ("courseMaterial/{id}")
	public Course getCourse(@PathVariable long id) {
		
		return courseRepo.findById(id).get();
	}
	
	@GetMapping("course")
	public Iterable<Course> getCourses() {
		
		return courseRepo.findAll();
	}

	// Elimina curso y material por Id OPCION 1
	@DeleteMapping("course/delete/Curso-y-Material{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteCursoyMaterialById(@PathVariable("id") long id) {
		courseRepo.deleteById(id);
		cursosMaterialRep.deleteById(id);
	}
		
	// Elimina curso por Id OPCION 2
	@DeleteMapping("curso/delete/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteById(@PathVariable("id") long id) {
	    courseRepo.deleteById(id);
	}
	        
	//Control del error
	@ExceptionHandler(Exception.class)
	public ResponseEntity<apiError> handlecourseNoEncontrado(Exception ex){
		
		apiError apierror = new apiError();
		apierror.setEstado(HttpStatus.NOT_FOUND);
		apierror.setFecha(LocalDateTime.now());
		apierror.setMensaje(ex.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apierror);
	}
}
