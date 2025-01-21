package Buillder;

import Services.DoSomethingService;

public class Client {
    public static void main(String[] args) {

        Student student = new Student();
        DoSomethingService.doSomething(student);
        student.setAge(25);
        student.setCollege("Something");
//
//        In the constructor we want to send all the attributes at once
//        First of all put all the data in the StudentBuilder
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setAge(27);
        studentBuilder.setCollege("Something");
        studentBuilder.setId(1);
        studentBuilder.setName("Something");

        Student student1 = new Student(studentBuilder);
    }
}
