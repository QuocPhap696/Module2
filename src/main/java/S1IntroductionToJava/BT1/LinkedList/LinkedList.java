package S1IntroductionToJava.BT1.LinkedList;

import S1IntroductionToJava.BT1.BTthayQuang.TrienKhaiLinkedList.MyLinkedListBTAP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinkedList {
    private static MyLinkedListBTAP nameSvList;

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numberList.add(sc.nextInt());
        }

        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            if (!newList.contains(numberList.get(i))) {
                newList.add(numberList.get(i));
            }
        }
        for (int elemets : newList) {
            System.out.print(elemets + " ");
        }
        List<String> newSvList = new ArrayList<>();
        System.out.println("nhập số");
        while (true) {
            System.out.println("1 . thêm sinh viên \n 2.Xoá sinh viên \n 3.Sua tên sinh vien \n  4.In ra danh sách \n 5.Quit");
            int selected = sc.nextInt();
            sc.nextLine();
            if (selected == 5) {
                break;
            }
            switch (selected) {
                case 1:
                    String name = sc.nextLine();
                    while (!name.isEmpty()) {
                        System.out.println("Nhập tên sinh viên");

                        newSvList.add(name);
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Danh sách sinh viên");
                    for (String nameSv : newSvList) {
                        System.out.println(nameSv);
                    }
                    break;
            }
            System.out.println("END");
        }
    }

}
