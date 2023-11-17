package repo;

import model.Student;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements CrudOperation<Student>{
    public List<Student> students = new LinkedList<>();
    int currentId;

    @Override
    public List<Student> getAll(){
        return students;
    }
    @Override
    public void create(Student student) {
        student.setId(++currentId);
        student.setCreatedAt(LocalDateTime.now());
        students.add(student);
        System.out.println("Add successfully!!" );
    }

    @Override
    public Student read(int id) {
        for(Student student: students){
            if(student.getId() == id){
                return student;
            }
        }
        System.out.println("model.Student's not found with ID: " + id);
        return null;
    }

    @Override
    public void update(Student student) {

        student.setUpdatedAt(LocalDateTime.now());
        System.out.println("Update successfully");
    }

    @Override
    public Student search(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void delete(Student student) {
        students.remove(student);
        System.out.println("Delete successfully");
        students.add(student);
    }
}
