package model;

import java.util.List;

public class Employee {

    private int id;

    private String name;

    private List<Qualification> qualifications;

    public Employee(int id, String name, List<Qualification> qualifications) {
        this.id = id;
        this.name = name;
        this.qualifications = qualifications;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Qualification> getQualifications() {
        return qualifications;
    }

    public void setQualifications(List<Qualification> qualifications) {
        this.qualifications = qualifications;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qualifications=" + qualifications +
                '}';
    }
}
