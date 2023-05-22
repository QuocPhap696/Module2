package S1IntroductionToJava.BT1.Comparator_ComparableBT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        //tạo list student
        List<Student> studentList = new ArrayList<Student>();
        //thêm student vào list
        studentList.add(new Student(1,"Pháp", 25));
        studentList.add(new Student(2,"Linh", 23));
        studentList.add(new Student(3,"Hii", 30));

        System.out.println("Danh sách theo tên");
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        //show list
        for (Student student:studentList){
            System.out.println(student.toString());
        }
        System.out.println("");
        System.out.println("Danh sách svien theo tuổi");
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()> o2.getAge() ? 1: -1;
            }
        });
        //show list ra
        for (Student student : studentList){
            System.out.println(student.toString());
        }

    }

}
