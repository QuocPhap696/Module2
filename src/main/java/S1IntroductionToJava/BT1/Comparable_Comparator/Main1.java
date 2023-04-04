package S1IntroductionToJava.BT1.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        Student student = new Student("Phap", 26, "Hue");
        Student student1 = new Student("Thao", 22, "Da Lat");
        Student student2 = new Student("Quoc", 23, "Sai Gon");
        Student student3 = new Student("Xiu", 27, "Da Nang");

        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student st : list) {
            System.out.println(student.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sanh theo tuoi");
        for (Student st : list) {
            System.out.println(st.toString());
        }
    }
}
