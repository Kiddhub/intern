package dto.request;

import java.util.Scanner;

public class CreateStudentRequest {

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
        System.out.println("Please fill this form below: ");
        System.out.print("Input name: ");
        studentRequest.setName(scanner.nextLine());
        System.out.print("Input age: ");
        studentRequest.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Input phone: ");
        studentRequest.setPhone(scanner.nextLine());
        System.out.print("Input Address: ");
        studentRequest.setAddress(scanner.nextLine());
        return studentRequest;
    }

    public static CreateStudentRequest updateStudent(){
        Scanner scanner = new Scanner(System.in);
        CreateStudentRequest updatedStudent = new CreateStudentRequest();
        System.out.print("Please input new name: ");
        updatedStudent.setName(scanner.nextLine());
        System.out.print("Please input new age: ");
        updatedStudent.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Please input new phone: ");
        updatedStudent.setPhone(scanner.nextLine());
        System.out.print("Please input new address: ");
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
