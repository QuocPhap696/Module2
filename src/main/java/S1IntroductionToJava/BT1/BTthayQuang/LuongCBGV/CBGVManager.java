package S1IntroductionToJava.BT1.BTthayQuang.LuongCBGV;

import S1IntroductionToJava.BT1.BTthayQuang.BookBT.Book;
import S1IntroductionToJava.BT1.BTthayQuang.CustomBT.ComparatorById;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.lang.*;
public class CBGVManager {
    Scanner scanner = new Scanner(System.in);
    // thằng arrayList là con của List(abstract nên ko thể tạo đối tượng từ List được(ko new List được)
    // nên phải nhờ thằng con overriding)
    List<CBGV> cbgvs;
    public CBGVManager() {
        //tạo danh sách
        cbgvs = new ArrayList<>();
        cbgvs.add(new CBGV("Quoc Phap", 25, "Hue", 1,
                20000, 25000, 5000));
    }

    //thêm danh sách
    public void addGV() {
        System.out.println("Nhập thông tin GV");
        System.out.println("Nhập họ tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int tuoi =  Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập quê quán");
        String quequan = scanner.nextLine();
        //nhập thêm lương
        System.out.println("Nhập Lương Cứng");
        Double luongcung = scanner.nextDouble();

        System.out.println("Nhập lương thưởng");
        Double luongthuong = scanner.nextDouble();
        System.out.println("Nhập tiền phạt");
        Double tienphat = scanner.nextDouble();

        Comparator comparator = new ComparatorById();
        cbgvs.sort(comparator);
        int maxId = cbgvs.get(cbgvs.size()-1).getID();

        CBGV cbgv = new CBGV();
        cbgv.setID(maxId + 1);
        cbgv.setHoTen(name);
        cbgv.setTuoi(tuoi);
        cbgv.setQueQuan(quequan);
        cbgv.setLuongCung(luongcung);
        cbgv.setThuong(luongthuong);
        cbgv.setTienPhat(tienphat);

        cbgvs.add(cbgv);
        hienthi();
    }

    //xoá Gv
    public void deleteGV() {
        System.out.println("Nhập ID GV mà bạn muốn xoá ");
        int id = scanner.nextInt();

        for (int i = 0; i < cbgvs.size(); i++ ) {
            if (id == cbgvs.get(i).getID()) {
                cbgvs.remove(i);
            }
        } hienthi();
    }
    //hiển thị list
    //String hoTen, int tuoi, String queQuan, int ID, double luongCung,
    //                double thuong, double tienPhat, double luongthuclinh
    public void hienthi() {
        System.out.printf("%15s | %10s | %10s | %10s | %10s | %10s | %10s | %10s \n", "HoTen", "Tuoi", "Quequan", "ID", "LuongCung",
                "thuong", "TienPhat", "Luongthuclinh");
        for (int i = 0; i < cbgvs.size(); i++) {
            CBGV cbgv = cbgvs.get(i);
            System.out.printf("%15s | %10s | %10s | %10s | %10s | %10s | %10s | %10s \n",
                    cbgv.getHoTen(), cbgv.getTuoi(), cbgv.getQueQuan(), cbgv.getID(), cbgv.getLuongCung(),
                    cbgv.getThuong(), cbgv.getTienPhat(), cbgv.getLuongthuclinh()
                   );
        }

    }

    public void hienthi(List<CBGV> cbgvs) {
        System.out.printf("%15s | %10s | %10s | %10s | %10s | %10s | %10s | %10s \n", "HoTen", "Tuoi", "Quequan", "ID", "LuongCung",
                "thuong", "TienPhat", "Luongthuclinh");
        for (int i = 0; i < cbgvs.size(); i++) {
            CBGV cbgv = cbgvs.get(i);
            System.out.printf("%15s | %10s | %10s | %10s | %10s | %10s | %10s | %10s \n",
                    cbgv.getHoTen(), cbgv.getTuoi(), cbgv.getQueQuan(),cbgv.getID(), cbgv.getLuongCung(),
                    cbgv.getThuong(), cbgv.getTienPhat(), cbgv.getLuongthuclinh()
            );
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CBGVManager cbgv = new CBGVManager();
        boolean checkActionmenu = true;
        do {
            System.out.println("Nhấn 1 để hiển thị");
            System.out.println("Nhấn 2 để xoá");
            System.out.println("Nhấn 3 để thêm");
            int actionMenu = Integer.parseInt(scanner.nextLine());
            switch (actionMenu) {
                case 1 :
                    cbgv.hienthi();
                    break;
                case 2 :
                    cbgv.deleteGV();
                    break;
                case 3 :
                    cbgv.addGV();
                    break;
                default:
                    System.out.println("Vui lòng nhập lại(chỉ 1 - 3)");
                    break;
            }
            boolean tieptuchaykhong = true;
            do {
                System.out.println("Em có muốn tiếp tục ? y/n ");
                String tieptucthaotac = scanner.nextLine();
                switch (tieptucthaotac) {
                    case "y" :
                        checkActionmenu = true;
                        tieptuchaykhong = false;
                        break;
                    case "n" :
                        checkActionmenu = false;
                        tieptuchaykhong = false;
                        break;
                    default:
                        tieptuchaykhong = true;
                }

            }while (tieptuchaykhong);
        } while (checkActionmenu);
    }
}
