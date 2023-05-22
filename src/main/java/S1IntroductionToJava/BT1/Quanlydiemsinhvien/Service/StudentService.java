package S1IntroductionToJava.BT1.Quanlydiemsinhvien.Service;

import S1IntroductionToJava.BT1.Quanlydiemsinhvien.Model.Student;
import S1IntroductionToJava.BT1.Quanlydiemsinhvien.Utils.CSVUtils;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    List<Student> studentList = new ArrayList<>();
    private String path = "/Users/QuocPhap/Desktop/Module2/C0123K1/Module2/src/main/java/S1IntroductionToJava/BT1/Quanlydiemsinhvien/data/Student.csv";
    public List<Student> getAll(){
        List<Student> studentList = new ArrayList<>();
        List<String> read = CSVUtils.readFile(path);
        for (String student:read){
            String[] strings = student.split(",");
            studentList.add(new Student(Long.parseLong(strings[0]), strings[1], Integer.parseInt(strings[2]), strings[3],
                    strings[4], Double.parseDouble(strings[5])));
        } return studentList;
    }

    public Student findById(long id){
        studentList = getAll();
        for (Student student:studentList){
            if (id == student.getId()){
                return student;
            }
        }
        return null;
    }

    public void addStudent(Student student){
        studentList = getAll();
        studentList.add(student);
        CSVUtils.writeFile(path,studentList);
    }

    public void deleteStudent(long id){
        studentList = getAll();
        Student student = findById(id);
        studentList.remove(student);
        CSVUtils.writeFile(path,studentList);
    }
    public void updateStudent(long id,Student newStudent) {
        studentList = getAll();
        // Student student = findById(id);
        for (Student student : studentList) {
            if (id == student.getId()) {
                student.setName(newStudent.getName());
                student.setAge(newStudent.getAge());
                student.setGender(newStudent.getGender());
                student.setAddress(newStudent.getAddress());
                student.setAveragePoint(newStudent.getAveragePoint());
                //studentList.add(student);

            }
        }
        CSVUtils.writeFile(path, studentList);
    }

}
