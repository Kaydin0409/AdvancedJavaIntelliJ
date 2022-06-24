package com.syntax.reviewClass08;

public class DoctorModifiers {

    public String firstName, lastName;
    String specialty;
    int experience;
    private double salary;
    public static String hospital;

   public DoctorModifiers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    DoctorModifiers(String firstName, String lastName, String specialty, int experience) {
        this(firstName, lastName);
        this.specialty = specialty;
        this.experience = experience;
    }

    public void printInfo() {
        System.out.println("Doctor's name is " + firstName + " " + lastName + " and their specialty is " + specialty);
    }

    protected void work() {
        printInfo(); //compiler is adding this. to printInfo(); you can type out this.printInfo();
        System.out.println("Doctor " + lastName + " works at " + hospital);
    }

    private void getPaid() {
        System.out.println("Doctor " + lastName + " gets paid " + salary);
    }

    public static void study(String university) {
        System.out.println("Doctor studied at " + university + " and now works at " + hospital);
    }
}
