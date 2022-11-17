package net.jaumebalmes.RelacionesSpringBoot.repositoty;

import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.RelacionesSpringBoot.entitys.Course;
import net.jaumebalmes.RelacionesSpringBoot.entitys.CourseMaterial;

public interface CourseRepository extends CrudRepository<Course, Long>{
  
}
