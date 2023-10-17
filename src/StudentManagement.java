import model.Student;
import utils.RenderTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    static void pressEnterKey(){
        Scanner input = new Scanner(System.in);
        System.out.println("====================== Press Enter to Continue =====================");
        input.nextLine();
        input.nextLine();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        List<Student> studentList = new ArrayList<>() {{
            add(new Student(1001, "james", "male", "java"));
            add(new Student(1002, "Bona", "male", "web"));
            add(new Student(1003, "Chan", "male", "java"));
            add(new Student(1004, "Chhunhy", "female", "web"));
        }};

        List<String> welcomeMenu = new ArrayList<>(List.of("Input Student","Search Student ", "Edit Student ", "Delete Student ","Show Students ","Exit"));

        do {
            RenderTable.renderMenu(welcomeMenu);
            System.out.println(">>> Choose your option : ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Student Entry!");
                    break;
                case 5:
                    RenderTable.renderStudents(studentList);
                    break;
                default:
                    System.out.println("Invalid Choice!!! Choose again from 1 - 6 !!! ");
                    break;

            }
            pressEnterKey();

        } while (option != 6);


    }
}
