package repo;

import model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements CrudOperation<Student>{
    private static final Logger logger = LoggerFactory.getLogger(StudentRepository.class);
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
        logger.info("Add successfully!!" );
    }

    @Override
    public Student read(int id) {
        for(Student student: students){
            if(student.getId() == id){
                return student;
            }
        }
        logger.error("model.Student's not found with ID: " + id);
        return null;
    }

    @Override
    public void update(Student student) {

        student.setUpdatedAt(LocalDateTime.now());
        logger.info("Update successfully");
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
        logger.info("Delete successfully");
        students.add(student);
    }
}
