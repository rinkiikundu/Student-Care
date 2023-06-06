package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.TeacherClass;
import edu.neu.csye6200.service.TeachService;
import edu.neu.csye6200.util.TestDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;



@Component
public class ControllerTeacher {

    @Autowired
    TeachService teachService;

    public void addTestData(){
        teachService.saveTeachers(new TestDataUtil().populateTeacherData("src/main/resources/Teachers.csv"));
    }

    public void displayAllTeachers(){
        teachService.getAllTeachers().forEach(System.out::println);
    }

    public List<TeacherClass> getAllTeachers(){
        return teachService.getAllTeachers();
    }
    public void removeTeacherById(Integer id){
        teachService.deleteTeacherById(id);
    }
    public Optional<TeacherClass> getTeacherById(Integer id){
        return teachService.getTeacherById(id);
    }

    public void addTeacher(String csv){
        teachService.saveTeacher(csv);
    }
    public void removeTeachers(){
        teachService.deleteTeachers();
    }


}
