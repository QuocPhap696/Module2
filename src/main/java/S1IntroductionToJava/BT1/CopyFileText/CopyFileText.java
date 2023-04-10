package S1IntroductionToJava.BT1.CopyFileText;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fileReader = new FileReader("/Users/QuocPhap/Desktop/Module2/C0123K1/Module2/testout.txt");
            BufferedReader br = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter("/Users/QuocPhap/Desktop/Module2/C0123K1/Module2/target.txt");
            BufferedWriter bw = new BufferedWriter(fileWriter);
            String c;
            while ((c = br.readLine())  != null) {
               bw.write(c + "\n");
            }
            br.close();
            bw.close();
            fileReader.close();
            fileWriter.close();

        }catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Tệp ko tồn tại");
        }
    }


}
