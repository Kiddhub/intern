package service.implement;

import dto.request.UpdateStudentRequest;
import model.Student;
import repo.StudentRepository;
import dto.request.CreateStudentRequest;
import service.StudentService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class StudentServiceImplement implements StudentService {

    StudentRepository studentRepository = new StudentRepository();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void createStudent(CreateStudentRequest studentRequest) {
        Student student = new Student();
        student.setName(studentRequest.getName());
        student.setAddress(studentRequest.getAddress());
        student.setAge(studentRequest.getAge());
        student.setPhone(studentRequest.getPhone());
        studentRepository.create(student);
    }

    @Override
    public void studentInformation() {
        System.out.print("Please input Student ID: ");
        int userId = scanner.nextInt();
        Student studentInformation = studentRepository.read(userId);
        if (studentInformation != null) {
            System.out.println("Student with ID: " + studentInformation);
        }
        else {
            System.out.println("Student is not found with ID");
        }
    }

    @Override
    public void updateStudent(UpdateStudentRequest studentRequest) {
        System.out.print("Please input ID: ");
        int studentId = scanner.nextInt();
        Student updatedStudent = studentRepository.search(studentId);
        if (updatedStudent != null) {
            updatedStudent.setName(studentRequest.getName());
            updatedStudent.setAddress(studentRequest.getAddress());
            updatedStudent.setPhone(studentRequest.getPhone());
            updatedStudent.setAge(studentRequest.getAge());
            studentRepository.update(updatedStudent);
        }

    }

    @Override
    public void deleteStudent() {
        System.out.print("Input ID: ");
        int deletedId = scanner.nextInt();
        Student deletedStudent = studentRepository.search(deletedId);
        if (deletedStudent != null) {
            deletedStudent.setDeletedAt(LocalDateTime.now());
            studentRepository.delete(deletedStudent);
        } else {
            System.out.println("Student not found with ID");
        }
    }

    @Override
    public void getAllStudents() {
        try{
            List<Student> listStudent = studentRepository.getAll();
            for (Student student : listStudent) {
                System.out.println(student);
            }
        }catch (NullPointerException e){
            System.out.println("No more students");
        }
    }
}
