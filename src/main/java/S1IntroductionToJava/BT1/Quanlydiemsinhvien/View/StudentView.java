package S1IntroductionToJava.BT1.Quanlydiemsinhvien.View;

import S1IntroductionToJava.BT1.Quanlydiemsinhvien.Comparator.ComparatorByAVGP;
import S1IntroductionToJava.BT1.Quanlydiemsinhvien.Model.Student;
import S1IntroductionToJava.BT1.Quanlydiemsinhvien.Service.StudentService;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    Scanner scanner = new Scanner(System.in);
    StudentService studentService = new StudentService();
    public void addStudent(){
        long id = 0;
        boolean checkID = false;
        do {
            try {
                System.out.println("Nhập ID:");
                id = Long.parseLong(scanner.nextLine());
                if (id < 0) {
                    System.out.println("ID phải lớn hơn 0! ");
                } else {
                    checkID = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Không đúng vui lòng nhập lại!");
            }

        } while (!checkID);



        String name = null;
        boolean validInput = false;
        do {
            System.out.println("Nhập tên:");
            try {
                name = scanner.nextLine();
                Integer.parseInt(name);
                System.out.println("Không đúng vui lòng nhập lại!");
            } catch (NumberFormatException e) {
                validInput = true;
            }
        } while (!validInput);


        int age = 0;
        boolean checkAge = false;
        do {
            try {
                System.out.println("Nhập tuổi:");
                age = Integer.parseInt(scanner.nextLine());
                if (age < 0) {
                    System.out.println("Tuổi phải lớn hơn 0! ");
                } else {
                    checkAge = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Không đúng vui lòng nhập lại!");
            }

        } while (!checkAge);


        String gender = null;
        boolean checkGender = false;
        do {
            System.out.println("Nhập giới tính sinh viên:");
            try {
                gender = scanner.nextLine();
                Integer.parseInt(gender);
                System.out.println("Không đúng vui lòng nhập lại!");
            } catch (NumberFormatException e) {
                checkGender = true;
            }
        } while (!checkGender);

        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();

        double averagePoint = 0;
        boolean checkPoint = false;
        do {
            try {
                System.out.println("Nhập điểm trung bình:");
                averagePoint = Integer.parseInt(scanner.nextLine());
                if (averagePoint < 0) {
                    System.out.println("Điểm trung bình phải lớn hơn 0! ");
                } else {
                    checkPoint = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Không đúng vui lòng nhập lại!");
            }

        } while (!checkPoint);
        Student student = new Student(id,name,age,gender,address,averagePoint);
        studentService.addStudent(student);
    }

    public void removeStudent(){
        System.out.println("Nhập id bạn muốn xoá");
        long id = Long.parseLong(scanner.nextLine());
        studentService.deleteStudent(id);
    }

    public void updateStudent(){
        long id = 0;
        boolean checkID = false;
        do {
            try {
                System.out.println("Nhập ID:");
                id = Long.parseLong(scanner.nextLine());
                if (id < 0) {
                    System.out.println("ID phải lớn hơn 0! ");
                } else {
                    checkID = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Không đúng vui lòng nhập lại!");
            }

        } while (!checkID);



        String name = null;
        boolean validInput = false;
        do {
            System.out.println("Nhập tên:");
            try {
                name = scanner.nextLine();
                Integer.parseInt(name);
                System.out.println("Không đúng vui lòng nhập lại!");
            } catch (NumberFormatException e) {
                validInput = true;
            }
        } while (!validInput);


        int age = 0;
        boolean checkAge = false;
        do {
            try {
                System.out.println("Nhập tuổi:");
                age = Integer.parseInt(scanner.nextLine());
                if (age < 0) {
                    System.out.println("Tuổi phải lớn hơn 0! ");
                } else {
                    checkAge = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Không đúng vui lòng nhập lại!");
            }

        } while (!checkAge);


        String gender = null;
        boolean checkGender = false;
        do {
            System.out.println("Nhập giới tính sinh viên:");
            try {
                gender = scanner.nextLine();
                Integer.parseInt(gender);
                System.out.println("Không đúng vui lòng nhập lại!");
            } catch (NumberFormatException e) {
                checkGender = true;
            }
        } while (!checkGender);

        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();

        double averagePoint = 0;
        boolean checkPoint = false;
        do {
            try {
                System.out.println("Nhập điểm trung bình:");
                averagePoint = Integer.parseInt(scanner.nextLine());
                if (averagePoint < 0) {
                    System.out.println("Điểm trung bình phải lớn hơn 0! ");
                } else {
                    checkPoint = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Không đúng vui lòng nhập lại!");
            }

        } while (!checkPoint);


        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setGender(gender);
        student.setAddress(address);
        student.setAveragePoint(averagePoint);

        studentService.updateStudent(id,student);
    }

    public void showStudent(){
        List<Student>studentList = studentService.getAll();
        System.out.println("Danh sách sinh viên");
        System.out.printf("%-18s %-25s %-10s %-15s %-20s %-12s\n", "Mã SV", "Tên Sinh Viên","Tuổi", "Giới tính","Địa chỉ","ĐTB");
        for (Student student : studentList){
            System.out.printf("%-18s %-25s %-10s %-15s %-20s %-12s\n",
                    student.getId(),student.getName(),student.getAge(),student.getGender(),student.getAddress(),student.getAveragePoint());
        }
    }
    public void showStudent(List<Student> students){
        List<Student>studentList = studentService.getAll();
        System.out.println("Danh sách sinh viên");
        System.out.printf("%-18s %-25s %-10s %-15s %-20s %-12s\n", "Mã SV", "Tên Sinh Viên","Tuổi", "Giới tính","Địa chỉ","ĐTB");
        for (Student student : studentList){
            System.out.printf("%-18s %-25s %-10s %-15s %-20s %-12s\n",
                    student.getId(),student.getName(),student.getAge(),student.getGender(),student.getAddress(),student.getAveragePoint());
        }
    }


    public static void exit(){
        System.out.println("Good Bye");
        System.exit(3);
    }
    public void sortAveragePointView(){
        List<Student> studentList = studentService.getAll();
        Comparator comparator = new ComparatorByAVGP();
        studentList.sort(comparator);
        showStudent(studentList);
    }

    public static void main(String[] args){
        StudentView studentView = new StudentView();
        studentView.removeStudent();
    }
}

