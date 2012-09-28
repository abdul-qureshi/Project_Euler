package solutions.project.euler;



public class Palindrome {

    /**
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 998001; i > 10; i--) {
            if (is_palindrome(i)) {
                int factor = findFactor(i);
                if (factor != 1) {
                    if (i/factor < 1000) {
                        System.out.println(i);
                        System.out.println("Factor " + factor);
                        System.out.println("Other Factor " + i/factor);
                        return;
                    }
                }
            }
        }
    }
   
    public static boolean is_palindrome(int number){
        int[] digit = new int[6];
        int counter = 0;
        int temp = number;
        do {
            int n =0;
            n = temp%10;
            digit[counter] = n;
            counter++;
            temp = (temp-n)/10;
        } while (temp != 0);
        int reverse = 0;
        for (int i = 0; i < counter; i++) {
            reverse += digit[i]*Math.pow(10,(counter-1-i));
        }
        return (number == reverse);
    }
   
    public static int findFactor (int number) {
        for (int i = 999; i > 1; i--) {
            if (number%i == 0) {
                return i;
            }
        }
        return 1;
    }

}

