package S1IntroductionToJava.BT1.BTthayQuang.HashSet_Set;

import java.util.*;

public class BT_rutthamtrungthuong_Hashet {
    Set<String> phieuduthuong = new  HashSet <String>();

    public BT_rutthamtrungthuong_Hashet() {
    }

    //thêm mã số dự thưởng
    public boolean themPhieu(String giaTri) {
        return this.phieuduthuong.add(giaTri);
    }

    //xoá phiểu
    public boolean xoaPhieu(String giaTri) {
        return this.phieuduthuong.remove(giaTri);
    }

    //kiểm tra mã
    public boolean kiemtraPhieutontai(String  giaTri) {
        return this.phieuduthuong.contains(giaTri);
    }

    //xoá tất cả phiếu dự thưởng
    public void  xoatatcaphieuduthuong() {
        this.phieuduthuong.clear();
    }

    //đếm số lượng phiếu
    public int laysoluong() {
        return this.phieuduthuong.size();
    }

    //rút thăm
    public String rutTham() {
        String ketQua = "";
        //ramdon : lấy ra giá trị ngẫu nhiên
        //lấy ra vị trí ngẫu nhiên từ 0 > nhỏ hơn size
        Random rd = new Random();
        int vitri = rd.nextInt(this.phieuduthuong.size());
        ketQua = (String) this.phieuduthuong.toArray()[vitri];
        return ketQua;

    }
    //in ra
    public void intatca() {
        System.out.println(Arrays.toString(this.phieuduthuong.toArray()));
    }
    public static void main(String[] args) {

        int luachon = 0;
        Scanner scanner = new Scanner(System.in);
        BT_rutthamtrungthuong_Hashet rt = new BT_rutthamtrungthuong_Hashet();
        do {
            System.out.println("Menu:");
            System.out.println("1.Thêm mã số dự thưởng");
            System.out.println("2. Xoá mã số dự thưởng");
            System.out.println("3. Kiểm tra mã dự thưởng có tồn tại hay không ?");
            System.out.println("4.Xoá tất cả phiểu dự thưởng");
            System.out.println("5. Số lượng phiếu dự thưởng");
            System.out.println("6. Rút thăm trúng thưởng" );
            System.out.println("7. in tất cả");
            System.out.println("0.Thoát chương trình");
            luachon = scanner.nextInt();
            scanner.nextLine();
            if (luachon ==1 || luachon ==2 || luachon ==3 ) {
                System.out.println("Nhập vào");
                String giaTri = scanner.nextLine(); //lấy ra 1 giá trị
                if (luachon ==1 ) {
                    rt.phieuduthuong.clear();
                } else if (luachon ==2) {
                    rt.xoaPhieu(giaTri);
                    System.out.println("Kiểm tra kết quả :" + rt.kiemtraPhieutontai(giaTri));
                }
            } else if (luachon ==4) {
                rt.xoatatcaphieuduthuong();
            } else if (luachon ==5) {
                rt.laysoluong();
            } else if (luachon == 6) {
                rt.rutTham();
            }
            else if (luachon == 7) {
                System.out.println("mã phiếu là: ");
                rt.intatca();
            }
        } while (luachon != 0);
    }
}
