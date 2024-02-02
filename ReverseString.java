public class ReverseString {

    public static void main(String[] args) {

        String name = "12345";
        int strLen = name.length();
        String voidStr = " ";

        for (int i = strLen - 1; i >= 0; i--) {

            voidStr = voidStr + name.charAt(i);
        }
        System.out.println("The Reverse String is =>" + voidStr);
        
    }
}