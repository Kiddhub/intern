package dto.request;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class CreateStudentRequest {

    private static final Logger logger = LoggerFactory.getLogger(UpdateStudentRequest.class);

    private String name;
    private String address;
    private String phone;
    private int age;

    public CreateStudentRequest(String name, String address, String phone, int age) {
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

    public CreateStudentRequest() {
    }

    public static CreateStudentRequest inputStudent(){
        Scanner scanner = new Scanner(System.in);
        CreateStudentRequest studentRequest = new CreateStudentRequest();
        logger.info("Please fill this form below: ");
        logger.info("Input name: ");
        studentRequest.setName(scanner.nextLine());
        logger.info("Input age: ");
        studentRequest.setAge(scanner.nextInt());
        scanner.nextLine();
        logger.info("Input phone: ");
        studentRequest.setPhone(scanner.nextLine());
        logger.info("Input Address: ");
        studentRequest.setAddress(scanner.nextLine());
        return studentRequest;
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
