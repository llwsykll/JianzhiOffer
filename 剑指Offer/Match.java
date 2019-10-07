public class Match {
    public boolean match(char[] str, char[] pattern)
    {
        if (str == null || pattern == null) {
            return false;
        }
        return matchCore(str, pattern, 0, 0);
    }
    
    public boolean matchCore(char[] str, char[] pattern, int strIndex, int patIndex) {
        if (strIndex == str.length -1 && patIndex == pattern.length -1 ) {
            return true;
        }
        if (strIndex != str.length- 1 && patIndex == pattern.length-1) {
            return false;
        }
        if (pattern[patIndex + 1] == '*') {
            if (pattern[patIndex] == str[strIndex] || (pattern[patIndex] == '.' && str.length-1 != strIndex)) {
                return matchCore(str, pattern, strIndex + 1, patIndex + 2) ||
                        matchCore(str, pattern, strIndex + 1, patIndex) ||
                        matchCore(str, pattern, strIndex, patIndex + 2);
            } else {
                return matchCore(str, pattern, strIndex, patIndex + 2);
            }
        }
        if (pattern[patIndex] == str[strIndex] || (pattern[patIndex] == '.' && str.length-1 != str[strIndex])) {
            return matchCore(str, pattern, strIndex + 1, patIndex + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        Match m = new Match();
        String a = "";
        String b = ".*";
        char[] str = a.toCharArray();
        char[] pattern = b.toCharArray();
        m.match(str, pattern);
    }
}