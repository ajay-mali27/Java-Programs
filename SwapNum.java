public class SwapNum {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;

        // Before Swapping;

        System.out.println("Before Swapping");
        System.out.println(a);
        System.out.println(b);

        // After Swapping;

        int temp = a;  
        a = b;
        b = temp;

        // Display The Value After The Swapping;

        System.out.println("After Swapping");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
