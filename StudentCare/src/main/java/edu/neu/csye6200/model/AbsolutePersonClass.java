package edu.neu.csye6200.model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class AbsolutePersonClass {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personId;
    private int personAge;
    private String personName;

    public AbsolutePersonClass() {
    }

    public AbsolutePersonClass(int personAge, String personName) {
        this.personAge = personAge;
        this.personName = personName;
    }

    public AbsolutePersonClass(int id, int personAge, String personName) {
        this.personId = id;
        this.personAge = personAge;
        this.personName = personName;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "AbsPerson{" +
                "id=" + personId +
                ", age=" + personAge +
                ", name='" + personName + '\'' +
                '}';
    }
}
