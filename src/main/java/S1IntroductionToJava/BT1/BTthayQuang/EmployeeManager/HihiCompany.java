package S1IntroductionToJava.BT1.BTthayQuang.EmployeeManager;

import java.util.*;

public class HihiCompany {
    List<Employee> employees;
    Scanner scanner = new Scanner(System.in);

    public HihiCompany() {
        employees = new ArrayList<>();
        //long id, String fullName, Date birthDay, String phone, String email,
        // EmployeeType employeeType, int expInYear, String proSkill
        Employee ep1 = new Experience(1, "Quoc Phap", new Date(1997), 0336056504, "Phap@gmail.com",
                Employee_type.Experience, 2, "Sơ sơ");
        Employee ep2 = new Intern("Sư Phạm", 2, "DH Hue");
        ep2.setID(2);
        ep2.setFullname("Thiều Bảo Trâm");
        ep2.setBirthday(new Date(1995));
        ep2.setPhone(0123456);
        ep2.setEmail("Tram@gmail.com");


        employees.add(ep1);
        employees.add(ep2);

    }

    public void themNhanVien() {
//        System.out.println("Nhập ID");
//        int id =Integer.parseInt(scanner.nextLine()) ;
        System.out.println("Nhập Họ Tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String ngaysinh = scanner.nextLine();
        System.out.println("Nhập số điện thoại");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập số năm kinh nghiệm");
        int kinhnghiem = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập trình độ");
        String trinhdo = scanner.nextLine();

        Comparator comparator = new ComparatorById();
        employees.sort(comparator);
        int maxId = employees.get(employees.size() - 1).getID();
        Experience employee = new Experience();
        employee.setID(maxId + 1);
        employee.setFullname(name);
        employee.setBirthday(new Date());
        employee.setPhone(phone);
        employee.setEmail(email);
        employee.setEmployeeType(Employee_type.Intern);
        employee.setExpInYear(3);
        employee.setProSkill("tạm tạm");

        employees.add(employee);
        showNhanVien();
    }

    //xoá nhân viên
    public void xoaNhanVien() {
        System.out.println("Nhập tên ID mà bạn muốn xoá");
        int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getID()) {
                employees.remove(i);
            }
        }
        showNhanVien();
    }

    //show nhân viên
    private void showNhanVien() {
        //int ID, String fullname, Date birthday, int phone,
        //                    String email, Employee_type employeeType)
        System.out.printf("%5s | %20s | %30s | %20s | %20s | %20s \n", "ID", "Name", "Birthday",
                "Phone", "Email", "employee");
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            System.out.printf("%5s | %20s | %30s | %20s | %20s | %20s \n",
                    employee.getID(), employee.getFullname(), employee.getBirthday(),
                    employee.getPhone(), employee.getEmail(), employee.getEmployeeType());
        }
    }

    private void showNhanVien(List<Employee> employees) {
        //int ID, String fullname, Date birthday, int phone,
        //                    String email, Employee_type employeeType)
        System.out.printf("%5s | %20s | %20s | %20s | %20s | %20s | %20s \n", "ID", "Name", "Birthday",
                "Phone", "Email", "employee");
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            System.out.printf("%5s | %20s | %20s | %20s | %20s \n",
                    employee.getID(), employee.getFullname(), employee.getBirthday(),
                    employee.getPhone(), employee.getEmail(), employee.getEmployeeType());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HihiCompany hihiCompany = new HihiCompany();
        boolean checkActionMenu = true;
        do {
            System.out.println("Menu quản lý danh sách");
            System.out.println("Nhấn 1 để show nhân viên");
            System.out.println("Nhấn 2 để thêm nhân viên");
            System.out.println("Nhấn 3 để xoá nhân viên");
            int actionMenu = Integer.parseInt(scanner.nextLine());
            switch (actionMenu) {
                case 1:
                    hihiCompany.showNhanVien();
                    break;
                case 2:
                    hihiCompany.themNhanVien();
                    break;
                case 3:
                    hihiCompany.xoaNhanVien();
                    break;
                default:
                    System.out.println("vui lòng nhập lại");
            }
            boolean checkActionMenuContinue = true;
            do {
                System.out.println("Bạn có muốn tiếp tục ? y/n");
                String actionMenuContinue = scanner.nextLine();
                switch (actionMenuContinue) {
                    case "y":
                        checkActionMenu = true;
                        checkActionMenuContinue = false;
                        break;
                    case "n":
                        checkActionMenu = false;
                        checkActionMenuContinue = false;
                        break;
                    default:
                        System.out.println("vui lòng nhập lại");
                        break;
                }
            } while (checkActionMenuContinue);
        } while (checkActionMenu);
    }
}
