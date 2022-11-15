package net.jaumebalmes.RelacionesSpringBoot.entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CourseMaterial {
    @Id // clau a la taula de la BD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public String url;
  
    @ManyToOne
    private Course course;

    public CourseMaterial() {
        super();
    }
    public CourseMaterial(long id, String url, Course course) {
        super();
        this.id = id;
        this.url = url;
        this.course = course;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    @Override
    public String toString() {
        return "CourseMaterial [id=" + id + ", url=" + url + ", course=" + course + "]";
    }
}