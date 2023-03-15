package S1IntroductionToJava.BT1.Test;


    public class Sinhvien {
       public String ten;
       public int tuoi;

       public void setTen(String ten){
           this.ten = ten;
       }
        public void setTuoi(int tuoi){
           this.tuoi = tuoi;
       }
       public void showStudent() {
           System.out.println("ten : " + ten);
           System.out.println("tuoi : " +tuoi);
       }

        public static void main(String args[]) {
           Sinhvien sv = new Sinhvien();
           sv.setTen ("nguyen van a");
            sv.setTuoi(23);
            sv.showStudent();
        }
    }


