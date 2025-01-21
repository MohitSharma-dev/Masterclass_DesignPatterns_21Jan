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

    public StudentBuilder setCgpa(double cgpa) {
        this.cgpa = cgpa;
        return this;
    }

    public int getId() {
        return id;
    }

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public int getGradYear() {
        return gradYear;
    }

    public StudentBuilder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    public String getCollege() {
        return college;
    }

    public StudentBuilder setCollege(String college) {
        this.college = college;
        return this;
    }

    public double getXiiScore() {
        return xiiScore;
    }

    public StudentBuilder setXiiScore(double xiiScore) {
        this.xiiScore = xiiScore;
        return this;
    }

    void validate(){
//        put all validations
        if(getAge() < 21){
            throw new IllegalArgumentException("Age must be greater than 21");
        }
        if(getGradYear() >= 2024){
            throw new IllegalArgumentException("GradYear must be greater than 2024");
        }
    }

    public Student build() {
//        keep all the validations
        validate();
        return new Student(this);
    }
}
