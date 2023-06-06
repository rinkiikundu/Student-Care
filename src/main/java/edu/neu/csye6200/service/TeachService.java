package edu.neu.csye6200.service;

import edu.neu.csye6200.model.TeacherClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import edu.neu.csye6200.repository.TeacherRepository;


@Service
public class TeachService {
    @Autowired
    TeacherRepository teachRepository;
    TeacherFactory tf = new TeacherFactory();

    public List<TeacherClass> getAllTeachers() {
        List<TeacherClass> teachers = new ArrayList<>();
        teachRepository.findAll().forEach(teachers::add);
        return teachers;
    }

    public void saveTeachers(List<TeacherClass> teachers) {
        teachRepository.saveAll(teachers);
    }

    public void saveTeacher(TeacherClass teacher) {
        teachRepository.save(teacher);
    }

    public void saveTeacher(String csv) {
        teachRepository.save(tf.getObject(csv));
    }

    public Optional<TeacherClass> getTeacherById(Integer id) {
        return teachRepository.findById(id);
    }

    public void deleteTeacherById(Integer id) {
        teachRepository.deleteById(id);
    }

    public void deleteTeachers() {
        teachRepository.deleteAll();
    }
}
