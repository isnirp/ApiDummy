package com.commons;

import com.commons.model.Course;
import com.commons.model.Student;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DummyData {
    private List<Course> courseList;
    private List<Student> studentList;

    public DummyData() {
        ObjectMapper mapper = new ObjectMapper();

        ClassLoader classLoader = App.class.getClassLoader();
        File fileCourse = new File(classLoader.getResource("course.json").getFile());
        File fileStudent = new File(classLoader.getResource("student.json").getFile());
        try {
            courseList = mapper.readValue(fileCourse, new TypeReference<List<Course>>() {});
            studentList = mapper.readValue(fileStudent, new TypeReference<List<Student>>() {});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
