package S1IntroductionToJava.BT1.CinemaBaiTap;

public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15,5, 2022);
        Ngay ngay2 = new Ngay(31, 01, 2023);
        Ngay ngay3 = new Ngay(13, 02, 2025);

        HangSanXuat hangSanXuat1 = new HangSanXuat("Marvel", "Mẽo");
        HangSanXuat hangSanXuat2 = new HangSanXuat("DC", "America");
        HangSanXuat hangSanXuat3 = new HangSanXuat("EmLa", "VietNam");

        BoPhim boPhim1 = new BoPhim("Enternals", 2020, hangSanXuat3, 65000, ngay1);
        BoPhim boPhim2 = new BoPhim("TheFlash", 2018, hangSanXuat1, 70000, ngay2);
        BoPhim boPhim3 = new BoPhim("IronMan", 2021, hangSanXuat2, 80000, ngay3);

        System.out.println("So sánh giá 1 rẻ hơn 2 : " + boPhim1.kiemtragiaverehon(boPhim2));
        System.out.println("So sánh giá 3 rẻ hơn 2 : " + boPhim3.kiemtragiaverehon(boPhim2));


        System.out.println("Tên hãng sản xuất của bộ phim 3 là :" + boPhim3.laytenHangSanXuat());

        System.out.println("Giá vé sau khi khuyến mãi 15% là : " +boPhim1.giaSauKhuyenMai(15) );
        System.out.println("Giá vé sau khi khuyến mãi 20% là : " +boPhim2.giaSauKhuyenMai(20) );
        System.out.println("Giá vé sau khi khuyến mãi 50% là : " +boPhim3.giaSauKhuyenMai(50) );
    }
}
