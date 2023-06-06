package edu.neu.csye6200.service;
import edu.neu.csye6200.model.*;


public class TeacherFactory extends AbsolutePersonFactory<TeacherClass> {
    
    public TeacherClass getObject() {
        return new TeacherClass();
    }
    public TeacherClass getObject(String csvData) {
        return new TeacherClass(csvData);
    }


}
