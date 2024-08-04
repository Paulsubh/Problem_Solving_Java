package Strings;

import java.util.Arrays;

public class RemoveDuplicateCharacterString {

    public static String removeDuplicates(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        StringBuilder ans = new StringBuilder();

        ans.append(ch[0]);
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] != ch[i - 1]) {
                ans.append(ch[i]);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "ankita";
        s=s.toLowerCase();
        System.out.println(removeDuplicates(s));
    }
}
