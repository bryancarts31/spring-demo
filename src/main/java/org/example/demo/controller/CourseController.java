package org.example.demo.controller;

import org.example.demo.model.Course;
import org.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }

    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable int id){
        return courseService.getCourse(id);
    }

    @PostMapping("/courses")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }

    @PutMapping("/courses/{id}")
    public void updateCourse(@RequestBody Course course){
        courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse( @PathVariable int id){
        courseService.deleteCourse(id);
    }
}
