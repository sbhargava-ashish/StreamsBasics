package model;

public class Qualification {

    private String name;

    private Integer year;

    public Qualification(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Qualification{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
