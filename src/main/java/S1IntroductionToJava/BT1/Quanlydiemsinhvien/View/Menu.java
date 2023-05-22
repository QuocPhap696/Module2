package S1IntroductionToJava.BT1.Quanlydiemsinhvien.View;

import S1IntroductionToJava.BT1.Quanlydiemsinhvien.Model.Student;

import java.util.Scanner;

public class Menu {
    StudentView studentview = new StudentView();
    public void view(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Chương trình quản lý sinh viên");
            System.out.println("1. xem danh sách");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. cập nhật sinh viên");
            System.out.println("4. xoá sinh viên");
            System.out.println("5. sắp xếp theo điểm trung bình");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            System.out.println("Thoát chức năng");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    studentview.showStudent();
                    break;
                case 2:
                    studentview.addStudent();
                    break;
                case 3:
                    studentview.updateStudent();
                    break;
                case 4:
                    studentview.removeStudent();
                case 5:
                    studentview.sortAveragePointView();
                case 6,7:
                    break;
                case 8:
                    studentview.exit();
            }
        }while (choice != 8);
    }
}
