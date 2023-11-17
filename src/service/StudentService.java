package service;

import dto.request.CreateStudentRequest;

public interface StudentService {
    void createStudent(CreateStudentRequest studentRequest);
    void studentInformation();

    void updateStudent(CreateStudentRequest studentRequest);

    void deleteStudent();
    void getAllStudents();

}
