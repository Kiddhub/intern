package controller;


import dto.request.UpdateStudentRequest;
import repo.StudentRepository;
import dto.request.CreateStudentRequest;
import service.implement.StudentServiceImplement;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentRepository studentRepository = new StudentRepository();
        StudentServiceImplement studentServiceImplement = new StudentServiceImplement();
        int choiceNumber;
        do {
            logger.info("Menu");
            logger.info("1. List Students");
            logger.info("2. Add Students");
            logger.info("3. Student Information");
            logger.info("4. Update Students");
            logger.info("5. Delete Students");
            logger.info("0. Exit");
            logger.info("Please enter your choose: ");
            choiceNumber = scanner.nextInt();
            switch (choiceNumber) {
                case (1):
                    logger.info("List Student");
                    studentServiceImplement.getAllStudents();
                    break;
                case (2):
                    logger.info("Add Student");
                    studentServiceImplement.createStudent(CreateStudentRequest.inputStudent());
                    break;
                case (3):
                    logger.info("Student Information");
                    studentServiceImplement.studentInformation();
                    break;
                case (4):
                    logger.info("Update Student");
                    studentServiceImplement.updateStudent(UpdateStudentRequest.updateStudent());
                    break;
                case (5):
                    logger.info("Delete Student");
                    studentServiceImplement.deleteStudent();
                    break;
                case(0):
                    logger.info("Thank you");
                    break;
                default:
                    logger.error("Invalid input!");
                    break;
            }
        } while (choiceNumber != 0);

    }
}