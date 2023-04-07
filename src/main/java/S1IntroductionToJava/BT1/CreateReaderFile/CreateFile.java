package S1IntroductionToJava.BT1.CreateReaderFile;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        int ch;
        FileReader fr = null;
        try {
           fr = new FileReader("text");
        }
        catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }
        while ((ch=fr.read()) != -1)
            System.out.print((char)ch);
        fr.close();
    }
}
