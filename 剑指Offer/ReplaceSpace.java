import java.util.*;

public class ReplaceSpace{
    public static String replaceSpace(StringBuilder str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int len = str.length();
        int numOfSpace = 0;
        for (int i = 0; i < len; i++) {
            char a = str.charAt(i);
            if (a == ' ') {
                numOfSpace++;
            }
        }
        int newLen = len + numOfSpace * 2;
        int oldIndex = len - 1;
        int newIndex = newLen - 1;
        str.setLength(newLen);
        for (; oldIndex >= 0 && oldIndex < newIndex; oldIndex--) {
            if (str.charAt(oldIndex) == ' ') {
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');
            } else {
                str.setCharAt(newIndex--, str.charAt(oldIndex));
            }
        }
        return str.toString();
    }
    public static void main (String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("we are happy");
        replaceSpace(str);

    }
}