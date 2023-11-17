package controller;

import repo.StudentRepository;
import dto.request.CreateStudentRequest;
import service.implement.StudentServiceImplement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRepository studentRepository = new StudentRepository();
        StudentServiceImplement studentServiceImplement = new StudentServiceImplement();
        int choiceNumber;
        do {
            System.out.println("Menu");
            System.out.println("1.List Students:");
            System.out.println("2.Add Students:");
            System.out.println("3.Student Information:");
            System.out.println("4.Update Students: ");
            System.out.println("5.Delete Students: ");
            System.out.print("Please enter your choose: ");
            choiceNumber = scanner.nextInt();
            switch (choiceNumber) {
                case (1):
                    System.out.println("List Student");
                    studentServiceImplement.getAllStudents();
                    break;
                case (2):
                    System.out.println("Add Student");
                    studentServiceImplement.createStudent(CreateStudentRequest.inputStudent());
                    break;
                case (3):
                    System.out.println("Student Information");
                    studentServiceImplement.studentInformation();
                    break;
                case (4):
                    System.out.println("Update Student");
                    studentServiceImplement.updateStudent(CreateStudentRequest.updateStudent());
                    break;
                case (5):
                    System.out.println("Delete Student");
                    studentServiceImplement.deleteStudent();
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        } while (choiceNumber != 0);

    }
}