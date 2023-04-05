package S1IntroductionToJava.BT1.BTthayQuang.EmployeeManager;

import java.util.Comparator;

//tính kế thừa : kế thừa lớp cha Employee
public class ComparatorById implements Comparator<Employee> {
    //tính đa hình
    @Override
    //ghi đè : thằng con viết lại và dùng theo cách của nó
    public int compare(Employee o1, Employee o2) {
        if (o1.getID() > o2.getID()) {
            return 1;
        } else if (o2.getID() == o1.getID()) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
