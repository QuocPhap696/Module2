package S1IntroductionToJava.BT1.tryCatch;

public class TryCatch2 {
    public static void main(String[] args) {
        try {
            int arr[]= new int[5];
            arr[6] =4;
            System.out.println("arr[6=]" + arr[6]);

            int data = 0;
            int div = 10 /data;
            System.out.println("Average="+ div );

            String obj = null;
            System.out.println(obj.length());
        }catch (NullPointerException e ){
            System.out.println(e);
        } catch (ArithmeticException e){
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Finished");
    }
}
