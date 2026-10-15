package Strings;

public class Replace_Spaces {
    public static void main(String[] args) {
        String str = "Java is fun";
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                result.append("%20");
            } else {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}