public class SwapwTV {
    public static void main(String[] args) {
        // Without 3rd variable

        int a = 5;
        int b = 7;

        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println(a);
        System.out.println(b);
    }
}
