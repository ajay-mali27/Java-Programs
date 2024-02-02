public class SwapwTV_3 {
    public static void main(String[] args) {
        // Without 3rd variable

        int a = 5;
        int b = 7;
        System.out.println("Before Swapping A =>" + a);
        System.out.println("Before Swapping B =>" + b);

        b = b + a; // 7= 7+5=12
        a = b - a; // 5=12-5 =7
        b = b - a; // 12= 12-7=5

    }
}
