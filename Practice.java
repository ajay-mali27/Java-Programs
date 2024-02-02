public class Practice {

    public static void main(String[] args) {
        // Reverse String

        int a = 10;
        int b = 20;

        System.out.println("Before Swap A =>" + a);
        System.out.println("Before Swap A =>" + b);

        // After Swap

        int temp = a; // temp=10;
        a = b; // a=> 20;
        b = temp;

        System.out.println("After Swapping A =>" + a);
        System.out.println("After Swapping B =>" + b);

    }
}