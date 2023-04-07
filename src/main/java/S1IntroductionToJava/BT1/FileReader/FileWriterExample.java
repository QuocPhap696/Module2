package S1IntroductionToJava.BT1.FileReader;

import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String args[]) {
//        char[] a = {'a','b'};
    try {
        FileWriter fw = new FileWriter("/Users/QuocPhap/Desktop/Module2/C0123K1/Module2/testout.txt");
        fw.write("Welcome mọi người hihi");
        fw.close();
    } catch (Exception e){
        System.out.println(e);
    }
        System.out.println("Sucess...");
    }
}
