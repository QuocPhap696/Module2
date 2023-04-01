package S1IntroductionToJava.BT1.BTthayQuang.EmployeeManager;

import java.util.Date;

public class Fresher extends Employee {
    private int Graduation_date;
    private String Graduation_rank;
    private String Education;

    public Fresher(int graduation_date, String graduation_rank, String education) {
        Graduation_date = graduation_date;
        Graduation_rank = graduation_rank;
        Education = education;
    }

    public Fresher(int ID, String fullname, Date birthday, int phone, String email, Employee_type employeeType, int graduation_date, String graduation_rank, String education) {
        super(ID, fullname, birthday, phone, email, employeeType);
        Graduation_date = graduation_date;
        Graduation_rank = graduation_rank;
        Education = education;
    }

    public int getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(int graduation_date) {
        Graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        Graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }
}
