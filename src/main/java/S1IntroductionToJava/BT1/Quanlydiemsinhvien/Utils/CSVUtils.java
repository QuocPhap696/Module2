package S1IntroductionToJava.BT1.Quanlydiemsinhvien.Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {
    public static <T> void writeFile(String path, List<T> item){
        try {
            PrintWriter printWriter = new PrintWriter(path);
            for (T students : item){
                printWriter.println(students.toString());
            }
            printWriter.flush();
            printWriter.close();
        }catch (FileNotFoundException e){
        throw new RuntimeException(path + "không có dữ liệu hoặc file trống");
        }
    }

    public static List<String> readFile(String path){
        List<String> students = new ArrayList<>();
        try {
            File file = new File(path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                if (!(line.trim().isEmpty())){
                    students.add(line);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException(path + "không có dữ liệu");
        }
        return students;
    }
}
