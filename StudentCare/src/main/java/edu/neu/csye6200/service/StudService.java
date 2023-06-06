package edu.neu.csye6200.service;

import edu.neu.csye6200.model.StudentClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.neu.csye6200.repository.StudentRepository;


@Service
public class StudService {
    @Autowired
    StudentRepository studRepository;
    StudentFactory sf = new StudentFactory();
    public List<StudentClass> getAllStudents(){
        List<StudentClass> students = new ArrayList<>();
        studRepository.findAll().forEach(students::add);
        return students;
    }

    public void saveStudents(List<StudentClass> students){
        studRepository.saveAll(students);
    }

    public void saveStudent(StudentClass student){
        studRepository.save(student);
    }

    public void saveStudent(String csv){
        studRepository.save(sf.getObject(csv));
    }

    public Optional<StudentClass> getStudentById(Integer id){
        return studRepository.findById(id);
    }

    public void deleteStudentById(Integer id){
        studRepository.deleteById(id);
    }
    public void deleteStudents() {
        studRepository.deleteAll();
    }
}
