package edu.neu.csye6200.util;

import edu.neu.csye6200.model.StudentClass;
import edu.neu.csye6200.model.TeacherClass;
import edu.neu.csye6200.model.ImmunizationClass;
import edu.neu.csye6200.service.*;
import java.util.ArrayList;
import java.util.List;


public class TestDataUtil {
    TeacherFactory tf = new TeacherFactory();
    StudentFactory sf = new StudentFactory();
    VaccineFactory vf = new VaccineFactory();
    
    public List<TeacherClass> populateTeacherData(String csv){
        List<TeacherClass> teachers = new ArrayList<>();
        List<String> teacherCsv = FileUtil.readCsv(csv);
        for(String teacherString : teacherCsv){
            teachers.add(tf.getObject(teacherString));
        }
        return teachers;
    }
    public List<StudentClass> populateStudentData(String csv){
        List<StudentClass> students = new ArrayList<>();
        List<String> studentCsvs = FileUtil.readCsv(csv);
        for(String studentString : studentCsvs){
            students.add(sf.getObject(studentString));
        }
        return students;
    }
    public List<ImmunizationClass> populateVaccineData(String csv){
        List<ImmunizationClass> vaccines = new ArrayList<>();
        List<String> vaccineCsvs = FileUtil.readCsv(csv);
        for(String vaccineString : vaccineCsvs){
            vaccines.add(vf.getObject(vaccineString));
        }
        return vaccines;
    }
}
