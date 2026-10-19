package twopointers;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "racecar";

        int left = 0;
        int right = str.length() - 1;
        boolean palindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(palindrome ? "Palindrome" : "Not a palindrome");
    }
}