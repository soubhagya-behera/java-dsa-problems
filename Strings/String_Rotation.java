package Strings;

public class String_Rotation {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";

        if (str1.length() == str2.length()
                && (str1 + str1).contains(str2)) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not a rotation");
        }
    }
}