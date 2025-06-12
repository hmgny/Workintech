package com.workintech.spring17challenge.controller;

import com.workintech.spring17challenge.exceptions.ApiException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.workintech.spring17challenge.entity.Course;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private List<Course> courses = new ArrayList<>();

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        courses.add(course);
        return new ResponseEntity<>(course, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Course> getCourseByName(@PathVariable String name) {
        return courses.stream()
                .filter(course -> course.getName().equalsIgnoreCase(name))
                .findFirst()
                .map(course -> new ResponseEntity<>(course, HttpStatus.OK))
                .orElseThrow(() -> new ApiException("Course not found", HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Course> updateCourse(@PathVariable Integer id, @RequestBody Course updatedCourse) {
        for (Course course : courses) {
            if (course.getId().equals(id)) {
                course.setName(updatedCourse.getName());
                course.setCredit(updatedCourse.getCredit());
                course.setGrade(updatedCourse.getGrade());
                return new ResponseEntity<>(course, HttpStatus.OK);
            }
        }
        throw new ApiException("Course not found", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Integer id) {
        courses.removeIf(course -> course.getId().equals(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}