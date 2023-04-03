package S1IntroductionToJava.BT1.BTthayQuang.HashSet_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Set1 {
    public static void main(String[] args) {
        Set<String> setString = new HashSet<String>();
        // set là 1 interface,ko chứa phần tử trùng lặp
        // Hashet là class triển khai của Set interface(sxep ko theo thứ tự)
        //Hashset ko đảm bảo các thứ tự nhập vào

        setString.add("B");
        setString.add("A");
        setString.add("E");
        setString.add("C");
        setString.add("B");
        setString.add("D");

        // cách sử dụng set : sử dụng vòng lặp for hoặc Iterator
        for (String s : setString) {
            System.out.println(s);
        }
        //hoặc sử dụng Interator (duyệt phần tử)
//        Iterator<String> itr = setString.iterator();
//        while (itr.hasNext()) {
//            String s = itr.next();
//            System.out.println(s);
//
//        }
        // xoá 1 phần tử trong set
//        setString.remove("A");
//        for (String s : setString) {
//            System.out.println(s);
//        }

    }
}
