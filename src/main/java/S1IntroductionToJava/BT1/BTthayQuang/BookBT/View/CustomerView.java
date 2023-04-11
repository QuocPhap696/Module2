package S1IntroductionToJava.BT1.BTthayQuang.BookBT.View;

import S1IntroductionToJava.BT1.BTthayQuang.BookBT.Service.CustomerServiceInMemory;

public class CustomerView {
    private CustomerServiceInMemory customerService;
    public CustomerView() {
        customerService = new CustomerServiceInMemory();
    }
    public void launcher() {

    }
}
