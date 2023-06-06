package edu.neu.csye6200.service;
import edu.neu.csye6200.model.*;


public class StudentFactory extends AbsolutePersonFactory<StudentClass> {
        
    @Override
    public StudentClass getObject(String csvData) {
        return new StudentClass(csvData);
    }
    
    @Override
    public StudentClass getObject() {
        // TODO Auto-generated method stub
        return new StudentClass();
    }
}
