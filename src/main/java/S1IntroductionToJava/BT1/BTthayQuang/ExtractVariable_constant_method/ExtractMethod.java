package S1IntroductionToJava.BT1.BTthayQuang.ExtractVariable_constant_method;

import java.util.List;

public class ExtractMethod {
    //phím tắt cmd + option + M
     // ví dụ tính tổng của 1 số nguyên (khá dài và phức tạp) vì vừa tính tổng
    //vừa in kết quả, làm cho mã code khó đọc và hiểu
//    public void sumAndPrintList(List<Integer> number) {
//        int sum = 0;
//        for (int i = 0; i < number.size(); i++) {
//            sum += number.get(i);
//        }
//        System.out.println("The sum of the list is :" + sum);
//    }

    //tách phương thức bằng cách tách đoạn mã tính tổng thành phương thức riêng bệt

    //tạo ra pthuc mới "sumList" để giảm độ phức tạp phthuc ban đầu
    public void sumAndPrintList(List<Integer> numbers) {
        int sum = sumList(numbers);
        System.out.println("The sum of the list is :" + sum);
    }
    public int sumList(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }
}
