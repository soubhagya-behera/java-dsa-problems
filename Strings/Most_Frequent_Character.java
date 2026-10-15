package Strings;

public class Most_Frequent_Character {
    public static void main(String[] args) {
        String str = "success";
        int[] freq = new int[256];

        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        char result = str.charAt(0);

        for (char ch : str.toCharArray()) {
            if (freq[ch] > freq[result]) {
                result = ch;
            }
        }

        System.out.println(result);
        System.out.println(freq[result]);
    }
}