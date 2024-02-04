public class J6_Fibonacci {
    public static void main(String[] args) {
        // Fibonacci Series
        // a b
        // 0,1,1,2,3,5,8,13

        int a = 0;
        int b = 1;
        System.out.println(a + " " + b);
        int c;
        for (int i = 1; i <= 10; i++) {
            c = a + b;
            a = b;
            b = c;

            System.out.println(c);

        }

    }
}
