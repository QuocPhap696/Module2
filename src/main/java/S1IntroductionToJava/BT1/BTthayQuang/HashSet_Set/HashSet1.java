package S1IntroductionToJava.BT1.BTthayQuang.HashSet_Set;
import java.util.HashSet;
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<String>();
        setA.add("Java");
        setA.add("Python");
        setA.add("Java");
        setA.add("PHP");
        System.out.println("Số phần tử của setA :" + setA.size());
        System.out.println("các phần tử của setA :" + setA);
        System.out.println("setA có chứa Java không ? " + setA.contains("Java"));
                                                // nếu thay bằng " java" thì trả về false
        System.out.println("SetA có chứa C++ không  ?" + setA.contains("C++"));
    }

    private void add(String python) {

    }

    private String contains(String java) {
        return null;
    }

    private String size() {
        return null;
    }
}
