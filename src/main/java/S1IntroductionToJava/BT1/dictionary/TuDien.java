package S1IntroductionToJava.BT1.dictionary;

import java.util.*;

public class TuDien {
   private Map<String, String> duLieu = new TreeMap<String, String>();
   public String themTu(String tuKhoa, String yNghia){
      return this.duLieu.put(tuKhoa, yNghia);
   }
   public String xoaTu(String tuKhoa){
      return this.duLieu.remove(tuKhoa);

   }
   public String traTu(String tuKhoa){
      String yNghia = this.duLieu.get(tuKhoa);
      return yNghia;
   }

   public void inTuKhoa(){
      Set<String> tapHopTuKhoa = this.duLieu.keySet();
      //keyset : lấy hết toàn bộ từ khoá
      System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
   }
   public int laySoLuong(){
      return this.duLieu.size();
   }
   public void xoaTatCa(){
      this.duLieu.clear();
   }

   public static void main(String[] args) {
      TuDien tuDien = new TuDien();
      int luachon =0 ;
      Scanner scanner = new Scanner(System.in);
      do {
         System.out.println("-------------");
         System.out.println("MENU");
         System.out.println("1. Thêm từ \n" +
                 "2.Xoá từ\n" +
                 "3. Tra từ\n" +
                 "4. In ra danh sách từ khoá\n" +
                 "5. Lấy ra số lượng từ khoá\n" +
                 "6. Xoá tất cả từ khoá\n" +
                 "0. Thoát");
         luachon = scanner.nextInt();
         scanner.nextLine();
         if (luachon==1){
            System.out.println("Nhập từ khoá");
            String tuKhoa = scanner.nextLine();
            System.out.println("Nhập ý nghĩa");
            String yNghia= scanner.nextLine();
            tuDien.themTu(tuKhoa,yNghia);
            System.out.println(" đã thêm");
         } else if (luachon ==2 || luachon ==3) {
            System.out.println("Nhập từ khoá");
            String tuKhoa = scanner.nextLine();
            if (luachon == 2){
               tuDien.xoaTu(tuKhoa);
            } else {
               System.out.println("Ý nghĩa là " + tuDien.traTu(tuKhoa));
               System.out.println(" đã thêm");
            }
         } else if (luachon == 4) {
            tuDien.inTuKhoa();
         } else if (luachon ==5) {
            System.out.println("Số lượng từ khoá là" + tuDien.laySoLuong());
         } else if (luachon == 6) {
            tuDien.xoaTatCa();
         }
      } while (luachon !=0);
   }
}
