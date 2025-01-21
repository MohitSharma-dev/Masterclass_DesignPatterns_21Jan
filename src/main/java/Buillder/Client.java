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
//        StudentBuilder studentBuilder = new StudentBuilder();

           Student student2 = Student.getBuilder()
                .setAge(27)
                .setCollege("Something")
                .setId(1)
                .setName("Something")
                        .build();

//        Student student1 = new Student(new Student.StudentBuilder());

//        Student class should give me the builder object
    }
}
