package service;

import dto.request.CreateStudentRequest;
import dto.request.UpdateStudentRequest;

public interface StudentService {
    void createStudent(CreateStudentRequest studentRequest);
    void studentInformation();

    void updateStudent(UpdateStudentRequest studentRequest);

    void deleteStudent();
    void getAllStudents();

}
