package edu.neu.csye6200.model;

import javax.persistence.Entity;

@Entity
public class TeacherClass extends AbsolutePersonClass {
    private int credits;

    public TeacherClass() {
    }

    public TeacherClass(int age, String name, int credits) {
        super(age, name);
        this.credits = credits;
    }

    public TeacherClass(int id, int age, String name, int credits) {
        super(id, age, name);
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public TeacherClass(String csvData)
    {
        super();
        try {
            String[] field = csvData.split(",");
            this.setPersonId(Integer.parseInt(field[0]));
            this.setPersonName(field[1]);
            this.setPersonAge(Integer.parseInt(field[2]));
            this.setCredits(Integer.parseInt(field[3]));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "credits=" + credits +
                "} " + super.toString();
    }
}
