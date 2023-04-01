package S1IntroductionToJava.BT1.BTthayQuang.EmployeeManager;

import java.util.Date;

public class Intern extends Employee {
    private String Majors;
    private int Semester;
    private String University_name;
public Intern(){}
    public Intern(String majors, int semester, String university_name) {
        Majors = majors;
        Semester = semester;
        University_name = university_name;
    }

    public Intern(int ID, String fullname, Date birthday, int phone, String email, Employee_type employeeType,
                  String majors, int semester, String university_name) {
        super(ID, fullname, birthday, phone, email, employeeType);
        Majors = majors;
        Semester = semester;
        University_name = university_name;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        Majors = majors;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int semester) {
        Semester = semester;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String university_name) {
        University_name = university_name;
    }
}
