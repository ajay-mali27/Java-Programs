public class J5_Vowel {

    public static void main(String[] args) {
        // Create a program to check if a string has vowel or not;
        String name = "carryminati";
        int strLen = name.length();

        for (int i = 0; i <= strLen; i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e'
                    || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                System.out.println(name.charAt(i) + "=>" + "is a vowel");
            } else {
                System.out.println(name.charAt(i) + "=>" + "Not a vowel");
            }
        }

    }
}