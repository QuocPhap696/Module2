package S1IntroductionToJava.BT1.BTthayQuang.LuongCBGV;

public class Nguoi {
    private String HoTen;
    private int Tuoi;
    private String QueQuan;
    private int ID;
    public Nguoi() {

    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Nguoi(String hoTen, int tuoi, String queQuan, int ID) {
        HoTen = hoTen;
        Tuoi = tuoi;
        QueQuan = queQuan;
        this.ID = ID;
    }
}
