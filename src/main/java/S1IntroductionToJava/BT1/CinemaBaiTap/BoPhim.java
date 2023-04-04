package S1IntroductionToJava.BT1.CinemaBaiTap;

public class BoPhim {
    private String tenPhim;
    private int namSanXuat;
    private HangSanXuat hangSanXuat;
    private double giaVe;
    private Ngay NgayChieu;

    public BoPhim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieu) {
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        NgayChieu = ngayChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public Ngay getNgayChieu() {
        return NgayChieu;
    }

    public void setNgayChieu(Ngay ngayChieu) {
        NgayChieu = ngayChieu;
    }

    public boolean kiemtragiaverehon(BoPhim phimkhac){
        return this.giaVe < phimkhac.giaVe;
    }

    public String laytenHangSanXuat(){
        return this.hangSanXuat.getTenHangSanXuat();
        //get để lấy dữ liệu ra
    }

    public double giaSauKhuyenMai(double x) {
        return this.giaVe * (1-x/100);
    }
}
