package com.example.springbootcourse.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// // com.example.springbootcourse.course.CourseService
// import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CourseService {

    @Autowired
    private CourseRepositry courseRepositry;

    public List<Course> getALLCourses(String topicId) {
        List<Course> courses = new ArrayList<Course>();
        courseRepositry.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCoursebyID(String id) {
        return courseRepositry.findById(id).get();
    }

    public void addCourse(Course course) {
        courseRepositry.save(course);
        return;
    }

    public void updateCourse(Course course) {
        courseRepositry.save(course);
        return;
    }

    public void deleteCourseByID(String id) {
        courseRepositry.deleteById(id);
        return;
    }
}
