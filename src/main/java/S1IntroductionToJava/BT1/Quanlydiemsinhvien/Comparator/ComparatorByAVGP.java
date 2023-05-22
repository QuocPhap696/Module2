package S1IntroductionToJava.BT1.Quanlydiemsinhvien.Comparator;

import S1IntroductionToJava.BT1.Quanlydiemsinhvien.Model.Student;

import java.util.Comparator;

public class ComparatorByAVGP implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
            return (int) (o1.getAveragePoint() - o2.getAveragePoint());
    }
}
