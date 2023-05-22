package S1IntroductionToJava.BT1.compareTo;

public class SinhVien implements Comparable<SinhVien> {
    private int maSinhVien;
    private String hoTen;
    private String tenLop;
    private double diemTrungBinh;

    public SinhVien(int maSinhVien, String hoTen, String tenLop, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
    public String getTen(){
       String s = this.hoTen.trim();
        if (s.indexOf(" ")>=0){
           int vt = s.lastIndexOf(" ");
            return s.substring(vt +1);
        } else {
            return s;
        }
    }

    @Override
    public int compareTo(SinhVien o) {
        String tenThis = this.getTen();
        String teno=o.getTen();

        return tenThis.compareTo(teno);
    }
}
