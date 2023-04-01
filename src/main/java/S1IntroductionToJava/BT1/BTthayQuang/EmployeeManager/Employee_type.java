package S1IntroductionToJava.BT1.BTthayQuang.EmployeeManager;

public enum Employee_type {
    Experience(0), Fresher(1), Intern(2);
    private int id;
    private Employee_type(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id ) {
        this.id = id;
    }

    public static void main(String[] args) {
        System.out.println(Employee_type.Experience);

        for (Employee_type e : values()) {
            System.out.println(e + "-" + e.getId());
        }
    }
}
