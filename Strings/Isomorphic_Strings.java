package Strings;

public class Isomorphic_Strings {
    public static void main(String[] args) {
        String str1 = "egg";
        String str2 = "add";

        System.out.println(isIsomorphic(str1, str2));
    }

    static boolean isIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] map1 = new int[65536];
        int[] map2 = new int[65536];

        for (int i = 0; i < str1.length(); i++) {
            char a = str1.charAt(i);
            char b = str2.charAt(i);

            if (map1[a] != map2[b]) {
                return false;
            }

            map1[a] = i + 1;
            map2[b] = i + 1;
        }

        return true;
    }
}