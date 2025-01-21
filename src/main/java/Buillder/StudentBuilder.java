package Buillder;

public class StudentBuilder {
    private int id;
    private String name;
    private int age;
    private int gradYear;
    private String college;
    private double xiiScore;
    private double cgpa;

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public double getXiiScore() {
        return xiiScore;
    }

    public void setXiiScore(double xiiScore) {
        this.xiiScore = xiiScore;
    }
}
