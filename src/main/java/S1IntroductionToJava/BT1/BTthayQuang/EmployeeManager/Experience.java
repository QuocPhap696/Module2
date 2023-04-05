package S1IntroductionToJava.BT1.BTthayQuang.EmployeeManager;

import java.util.Date;

public class Experience extends  Employee {
    //tính kế thừa (kế thừa lớp cha Employee, getter và setter)
    private int ExpInYear;
    private String ProSkill;
    public Experience() {
    }

    public Experience(int expInYear, String proSkill) {
        ExpInYear = expInYear;
        ProSkill = proSkill;
    }

    public Experience(int ID, String fullname, Date birthday, int phone, String email, Employee_type employeeType, int expInYear, String proSkill) {
        super(ID, fullname, birthday, phone, email, employeeType);
        ExpInYear = expInYear;
        ProSkill = proSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }

    public void add(Experience employee) {
    }
}
