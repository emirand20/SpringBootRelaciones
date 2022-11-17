package net.jaumebalmes.RelacionesSpringBoot.repositoty;

import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.RelacionesSpringBoot.entitys.CourseMaterial;

public interface CourseMaterialRepository extends CrudRepository <CourseMaterial, Long>{
    
}
