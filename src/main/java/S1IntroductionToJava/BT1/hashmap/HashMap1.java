package S1IntroductionToJava.BT1.hashmap;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;


public class HashMap1 {
//    public static void main(String[] args) {
//    Map<String, String> customer = new HashMap<>();
//    customer.put("Thảo", "Xíu");
//    customer.put("Hihi", "alo");
//    customer.put("Huhu","momo");
//        System.out.println("Các phần tử của map");
//        System.out.println(customer);
//    }

    // xoá value khỏi hasmap thông qua key
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Pháp");
        map.put(2,"Thảo");
        map.put(3,"Hihi");
        map.put(4,"alo");
        //bỏ giá trị ở key 4
        map.remove(4);
        System.out.println(map);
        //nếu chỉ muốn lấy values thì
        // System.out.println(map.values());
    }
}
