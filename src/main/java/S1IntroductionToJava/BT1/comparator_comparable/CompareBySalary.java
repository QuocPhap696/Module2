package S1IntroductionToJava.BT1.comparator_comparable;
import java.util.Comparator;
public class CompareBySalary implements Comparator<Employee> {
    @Override
    // nếu o1 > 02 : thì return 1
    // o1 == 02 :: thì return 0
    //ko thì trả về -1
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() > o2.getSalary()) {
            return 1;
        } else if (o1.getSalary() == o2.getSalary()) {
            return 0;
        }else {
            return -1;
        }
    }
}
