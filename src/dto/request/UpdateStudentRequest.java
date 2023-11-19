package dto.request;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class UpdateStudentRequest {

    private static final Logger logger = LoggerFactory.getLogger(UpdateStudentRequest.class);
    private String name;
    private String address;
    private String phone;
    private int age;

    public UpdateStudentRequest(String name, String address, String phone, int age) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UpdateStudentRequest() {
    }

    public static UpdateStudentRequest updateStudent(){
        Scanner scanner = new Scanner(System.in);
        UpdateStudentRequest updatedStudent = new UpdateStudentRequest();
        logger.info("Please input new name: ");
        updatedStudent.setName(scanner.nextLine());
        logger.info("Please input new age: ");
        updatedStudent.setAge(scanner.nextInt());
        scanner.nextLine();
        logger.info("Please input new phone: ");
        updatedStudent.setPhone(scanner.nextLine());
        logger.info("Please input new address: ");
        updatedStudent.setAddress(scanner.nextLine());
        return updatedStudent;
    }

    @Override
    public String toString() {
        return "StudentRequest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
