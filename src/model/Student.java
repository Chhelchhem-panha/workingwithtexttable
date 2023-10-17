package model;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String gender;
    private String classroom;
    public Student(){}
    public Student(int id , String name, String gender, String classroom){
        this.id = id;
        this.name= name;
        this.gender = gender;
        this.classroom = classroom;
    }

    public Student input(Scanner input){
        System.out.println("Enter student ID: ");
        id = input.nextInt();
        System.out.println("Enter Student Name : ");
        input.nextLine();
        name = input.nextLine();
        System.out.println("Enter Student Gender : ");
        gender = input.nextLine();
        System.out.println("Enter Student Classroom :");
        classroom = input.nextLine();
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", classroom='" + classroom + '\'' +
                '}' +"\n";
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
