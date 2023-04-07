package S1IntroductionToJava.BT1.CreateWriteFile;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        String str = "File Handling in Java using" + "FileWriter and FileReader";
        FileWriter fw = new FileWriter("/Users/QuocPhap/Desktop/Module2/C0123K1/Module2/testout.txt");
        for (int i = 0; i< str.length(); i++)
            fw.write(str.charAt(i));
        System.out.println("Writer successfull");
        fw.close();
    }

}
