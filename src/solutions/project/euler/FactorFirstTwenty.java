package solutions.project.euler;

public class FactorFirstTwenty {
   
    public static void main(String[] args) {
        for (int i = 2540;; i+=20) {
            if (is_divisible(i)) {
                System.out.print(i);
                return;
            }
        }
    }
   
    public static boolean is_divisible(int number) {
        for(int i = 1; i<=20; i++) {
            if (number%i!= 0) {
                return false;
            }
        }
        return true;
    }
}
