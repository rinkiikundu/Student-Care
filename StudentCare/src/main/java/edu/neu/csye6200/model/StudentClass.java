package edu.neu.csye6200.model;

import javax.persistence.Entity;
import java.text.SimpleDateFormat;
import java.util.Date;



@Entity
public class StudentClass extends AbsolutePersonClass {
    private int stuGrade;
    private Date stuRegistrationDate;
    private String stuAddress;
    private String stuPhoneNumber;
    private String stuParentName;
    private String stuParentEmail;

    public int getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(int stuGrade) {
        this.stuGrade = stuGrade;
    }

    public Date getStuRegistrationDate() {
        return stuRegistrationDate;
    }

    public void setStuRegistrationDate(Date stuRegistrationDate) {
        this.stuRegistrationDate = stuRegistrationDate;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public String getStuPhoneNumber() {
        return stuPhoneNumber;
    }

    public void setStuPhoneNumber(String stuPhoneNumber) {
        this.stuPhoneNumber = stuPhoneNumber;
    }

    public String getStuParentName() {
        return stuParentName;
    }

    public void setStuParentName(String stuParentName) {
        this.stuParentName = stuParentName;
    }

    public String getStuParentEmail() {
        return stuParentEmail;
    }

    public void setStuParentEmail(String stuParentEmail) {
        this.stuParentEmail = stuParentEmail;
    }

    public StudentClass() {
    }

    public StudentClass(int age, String name, int grade, Date registrationDate, String address, String phoneNumber, String parentName, String parentEmail) {
        super(age, name);
        this.stuGrade = grade;
        this.stuRegistrationDate = registrationDate;
        this.stuAddress = address;
        this.stuPhoneNumber = phoneNumber;
        this.stuParentName = parentName;
        this.stuParentEmail = parentEmail;
    }

    public StudentClass(int id, int age, String name, int grade, Date registrationDate, String address, String phoneNumber, String parentName, String parentEmail) {
        super(id, age, name);
        this.stuGrade = grade;
        this.stuRegistrationDate = registrationDate;
        this.stuAddress = address;
        this.stuPhoneNumber = phoneNumber;
        this.stuParentName = parentName;
        this.stuParentEmail = parentEmail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + stuGrade +
                ", registrationDate=" + stuRegistrationDate +
                ", address='" + stuAddress + '\'' +
                ", phoneNumber='" + stuPhoneNumber + '\'' +
                ", parentName='" + stuParentName + '\'' +
                ", parentEmail='" + stuParentEmail + '\'' +
                "} " + super.toString();
    }

    public StudentClass(String csvData) {
        super();
        try {
            String[] field = csvData.split(",");
            this.setPersonId(Integer.parseInt(field[0]));
            this.setPersonName(field[1]);
            this.setPersonAge(Integer.parseInt(field[2]));
            this.setStuGrade(Integer.parseInt(field[3]));
            //TODO: support time here tooo.
            this.stuRegistrationDate = new SimpleDateFormat("MM/dd/yyyy").parse(field[4]);
            this.stuParentName = field[5];
            //this.motherName = field[6];
            this.stuAddress = field[6];
            this.stuPhoneNumber = field[7];
            this.stuParentEmail = field[8];
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
