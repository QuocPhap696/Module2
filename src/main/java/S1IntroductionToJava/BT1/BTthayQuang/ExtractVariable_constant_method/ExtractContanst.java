package S1IntroductionToJava.BT1.BTthayQuang.ExtractVariable_constant_method;

public class ExtractContanst {
    //public static boolean isAuthorized(int role){ if(role == 1){
    //return true; }
    //public static final int ROLE_ADMIN = 1;
    //public static boolean isAuthorized(int role){ if(role == ROLE_ADMIN){
    //  return false; }

    public static final int ROLE_ADAM = 1;
    public static boolean isAuthorrized(int role) {
        if (role == ROLE_ADAM) {
            return true;
        }
        return false;
    }
}
