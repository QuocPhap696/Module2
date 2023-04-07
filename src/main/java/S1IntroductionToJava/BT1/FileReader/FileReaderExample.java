package S1IntroductionToJava.BT1.FileReader;

import java.io.FileReader;

public class FileReaderExample {
//    public static void main(String args[]) throws Exception {
//        FileReader fr = new FileReader("/Users/QuocPhap/Desktop/Module2/C0123K1/Module2/testout.txt");
//        int i;
//        while ((i = fr.read()) != -1) {
//            System.out.print((char) i);
//        }
//        fr.close();
//    }
public static void main(String[] args) {
    char[] array = new char[30];
    try {
        FileReader input = new FileReader("/Users/QuocPhap/Desktop/Module2/C0123K1/Module2/testout.txt");
        input.read(array);
        System.out.println("Data in the file");
        System.out.println(array);
        //đóng reader
        input.close();
    } catch (Exception e) {
        System.out.println(e.getStackTrace());
    }

}
}
