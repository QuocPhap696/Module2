package S1IntroductionToJava.BT1.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1,"phap",25,"hue"));
        studentList.add(new Student(2,"thao",26,"hanoi"));
        studentList.add(new Student(3,"xiu",24,"danang"));

        //sort studentList
        Collections.sort(studentList);

        //show
        for (Student student: studentList){
            System.out.println(student.toString());
        }
    }



}
