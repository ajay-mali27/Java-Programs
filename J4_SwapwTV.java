public class J4_SwapwTV {
    public static void main(String[] args) {
        // Without 3rd variable
        int a = 2;
        int b = 4;

        System.out.println("Before Swapping => A :" + a);
        System.out.println("Before Swapping => B :" + b);

        a = a + b; // a=6;
        b = a - b; // b=2;
        a = a - b; //a=4

        System.out.println("After Swapping : A =>" + a);
        System.out.println("After Swapping : B =>" + b);

    }
}
