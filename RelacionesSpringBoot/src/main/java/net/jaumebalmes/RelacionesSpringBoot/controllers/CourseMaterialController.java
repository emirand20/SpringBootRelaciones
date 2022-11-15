package net.jaumebalmes.RelacionesSpringBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.RelacionesSpringBoot.entitys.CourseMaterial;
import net.jaumebalmes.RelacionesSpringBoot.repositoty.CourseMaterialRepository;

@RestController
@RequestMapping("api")
public class CourseMaterialController {

    @Autowired
    CourseMaterialRepository courseMaterialRepo;

    @GetMapping("courseMaterial/{id}")
    public CourseMaterial getCourseMaterial(@PathVariable long id) {

        return courseMaterialRepo.findById(id).get();
    }

    @GetMapping("courseMaterial")
    public Iterable<CourseMaterial> getCoursesMaterials() {

        return courseMaterialRepo.findAll();
    }

}
