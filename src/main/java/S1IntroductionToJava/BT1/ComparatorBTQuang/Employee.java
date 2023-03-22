//package S1IntroductionToJava.BT1.ComparatorBTQuang;
//
//public class Employee implements Comparable<Employee> {
//    private String name;
//    private int age;
//    private float salary;
//
//    public Employee() {
//
//    }
//
//    public Employee(String name, int age, float salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public float getSalary() {
//        return salary;
//    }
//
//    public void setSalary(float salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("Name: %s, Age: %s, Salary: %s", this.name, this.age, this.salary);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof Employee) {
//            Employee o1 = (Employee) obj;
//            if (this.getName().equals(o1.getName()) && this.getAge() == ((Employee) obj).getAge()
//                && this.getSalary() == ((Employee)obj).getSalary()) {
//                return true;
//            }
//        }
//    }
//    @Override
//    public int hashCode() {
//        return Object.hash(this.age, this.name, this.salary);
//    }
//    @Override
//    public int compareTo(Employee o) {
//        if (this.age > o.getAge()) {
//            return 1;
//        } else if (this.age == o.getAge()) {
//            return 0;
//        } else
//            return -1;
//    }
//}
