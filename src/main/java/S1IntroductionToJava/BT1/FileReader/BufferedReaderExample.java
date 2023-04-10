package S1IntroductionToJava.BT1.FileReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("/Users/QuocPhap/Desktop/Module2/C0123K1/Module2/testout.txt");
        BufferedReader br = new BufferedReader(fr);
        int i;
        while ((i = br.read()) != -1) {
            System.out.println((char) i);
        }
        br.close();
        fr.close();
    }
}
