package com.syntax.class19;

public class Task5Tester {

    public static void main(String[] args) {
        Task5ConstructorGrade student=new Task5ConstructorGrade("Best Student Ozkhan ",99.9, 98.8, 99.5);
        student.calculateAvgGrade();

        Task5ConstructorGrade student2=new Task5ConstructorGrade("Bad sameer ",60.5,52.2,99.5);
        student2.calculateAvgGrade();
    }
}
