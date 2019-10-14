public class ReverseString {
    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char[] chars = str.toCharArray();
        ReverseSub(chars, 0, str.length() - 1);
        
        int begin = 0;
        int end = 0;
        while (end < str.length()) {
            while (chars[end] != ' ' && end < str.length()) {
                end++;
            }
            ReverseSub(chars, begin, end - 1);
            end++;
            begin = end;
        }
        return String.valueOf(chars);
    }
    
    public void ReverseSub(char[] str, int begin, int end) {
        while (begin < end) {
            char temp = str[begin];
            str[begin] = str[end];
            str[end] = temp;
            begin++;
            end--;
        }
    }

    public static void main(String[] args) {
        String str = "I am a student.";
        ReverseString rs = new ReverseString();
        rs.ReverseSentence(str);
    }
}