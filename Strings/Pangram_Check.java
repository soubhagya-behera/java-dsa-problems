package Strings;

public class Pangram_Check {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean[] seen = new boolean[26];
        int count = 0;

        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z' && !seen[ch - 'a']) {
                seen[ch - 'a'] = true;
                count++;
            }
        }

        System.out.println(count == 26 ? "Pangram" : "Not a pangram");
    }
}