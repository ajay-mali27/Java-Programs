import java.util.Scanner;

public class J1_PrimeNumber {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter The Prime Number");
        int PN = SC.nextInt();
        int temp = 0;
        // ------------------------------------------------------------
        for (int i = 2; i < PN; i++) {
            if (PN % i == 0) {
                temp = temp + 1;
            }
        }

        if (temp > 0) {
            System.out.println("Not a Prime Number");
        } else {
            System.out.println("The Number is Prime Number");
        }

    }

}
