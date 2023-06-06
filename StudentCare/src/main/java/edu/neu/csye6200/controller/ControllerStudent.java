package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.StudentClass;
import edu.neu.csye6200.service.StudService;
import edu.neu.csye6200.util.TestDataUtil;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ControllerStudent {
    @Autowired
    StudService studService;

    public void addTestData(){

        studService.saveStudents(new TestDataUtil().populateStudentData("src/main/resources/Students.csv"));
    }

    public void displayAllStudents(){
        studService.getAllStudents().forEach(System.out::println);
    }

    public List<StudentClass> getStudents(){
        return studService.getAllStudents();
    }
    public void removeStudentById(Integer id){
        studService.deleteStudentById(id);
    }
    public Optional<StudentClass> readStudentById(Integer id){
        return studService.getStudentById(id);
    }

    public void addStudent(String csv){
        studService.saveStudent(csv);
    }
    public void removeStudents(){
        studService.deleteStudents();
    }
}
