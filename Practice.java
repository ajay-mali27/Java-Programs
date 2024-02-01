import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        String name = "Prerana";
        int strLen = name.length();
        String voidStr = "";

        for (int i = strLen - 1; i >= 0; i--) {
            voidStr = voidStr + name.charAt(i);
        }
        System.out.println(voidStr);
    }
}