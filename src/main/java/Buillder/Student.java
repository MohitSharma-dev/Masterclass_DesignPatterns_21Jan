package Buillder;

public class Student {
    private int id;
    private String name;
    private int age;
    private int gradYear;
    private String college;
    private double xiiScore;
    private double cgpa;

    public Student(StudentBuilder studentBuilder){
        this.id = studentBuilder.getId();
        this.name = studentBuilder.getName();
        if(studentBuilder.getAge() < 21){
            throw new IllegalArgumentException("Age must be greater than 21");
        }
        this.age = studentBuilder.getAge();
        if(studentBuilder.getGradYear() >= 2024){
            throw new IllegalArgumentException("GradYear must be greater than 2024");
        }
        this.gradYear = studentBuilder.getGradYear();
        this.college = studentBuilder.getCollege();
        this.xiiScore = studentBuilder.getXiiScore();
        this.cgpa = studentBuilder.getCgpa();
    }

//    A lot of constructors is not a feasible or a right option is go with
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

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }
}
