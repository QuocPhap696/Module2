package S1IntroductionToJava.BT1.BTthayQuang.LuongCBGV;

public class CBGV extends Nguoi {
    private double LuongCung;
    private double Thuong;
    private double TienPhat;
    private double Luongthuclinh;

    public CBGV() {
    }

    public CBGV(String hoTen, int tuoi, String queQuan, int ID, double luongCung,
                double thuong, double tienPhat) {
        super(hoTen, tuoi, queQuan, ID);
        LuongCung = luongCung;
        Thuong = thuong;
        TienPhat = tienPhat;
    }

    public double getLuongCung() {
        return LuongCung;
    }

    public void setLuongCung(double luongCung) {
        LuongCung = luongCung;
    }

    public double getThuong() {
        return Thuong;
    }

    public void setThuong(double thuong) {
        Thuong = thuong;
    }

    public double getTienPhat() {
        return TienPhat;
    }

    public void setTienPhat(double tienPhat) {
        TienPhat = tienPhat;
    }

    public double getLuongthuclinh() {
        return getLuongCung() + getThuong() - getTienPhat();
    }

    public void setLuongthuclinh(double luongthuclinh) {
        Luongthuclinh = luongthuclinh;
    }
}
