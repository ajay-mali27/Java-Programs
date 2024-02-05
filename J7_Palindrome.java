import java.util.Scanner;

public class J7_Palindrome {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the Palindrome Number");
        int num = SC.nextInt();
        // System.out.println("You Entered =>" + num + " <=Number");
        int rem;
        int temp = num;

        int rev = 0;

        while (temp != 0) {
            rem = temp % 10; //
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if (num == rev) {
            System.out.println(num + " =>  Palindrome Number");
        } else {
            System.out.println(num + " =>Not palindrome");
        }

    }

}