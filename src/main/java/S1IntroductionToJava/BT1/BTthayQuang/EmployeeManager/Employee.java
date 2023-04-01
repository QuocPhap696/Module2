package S1IntroductionToJava.BT1.BTthayQuang.EmployeeManager;

import java.util.Date;

public class Employee {
    private int ID;
    private String Fullname;
    private Date Birthday;

    private int Phone;
    private String Email;

    private Employee_type employeeType;
    private int Employee_count;

    public Employee() {
    }


    public Employee(int ID, String fullname, Date birthday, int phone,
                    String email, Employee_type employeeType) {
        this.ID = ID;
        Fullname = fullname;
        Birthday = birthday;
        Phone = phone;
        Email = email;
        this.employeeType = employeeType;

    }



    public void showInfo() {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Employee_type getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(Employee_type employeeType) {

        this.employeeType = employeeType;
    }

    public int getEmployee_count() {
        return Employee_count;
    }

    public void setEmployee_count(int employee_count) {
        Employee_count = employee_count;
    }
}
