public class IsNumeric {
    public int index = 0;
    public boolean isNumeric(char[] str) {
        if (str == null) {
            return false;
        }
        boolean isNum = scanInt(str);
        
        if (index < str.length && str[index] == '.') {
            index++;
            isNum = scanUnsignedInt(str) || isNum;
        }
        if (index < str.length && (str[index] == 'e' || str[index] == 'E')) {
            index++;
            isNum = scanInt(str) && isNum;
        }
        return isNum && index == str.length;
    }
    public boolean scanInt(char[] str) {
        if (index < str.length && (str[index] == '+' || str[index] == '-')) {
            index++;
        }
        return scanUnsignedInt(str);
    }
    public boolean scanUnsignedInt(char[] str) {
        int start = index;
        while (index < str.length && str[index] >= '0' && str[index] <= '9') {
            index++;
        }
        return start < index;
    }

    public static void main(String[] args) {
        IsNumeric in = new IsNumeric();
        String s = "123e";
        System.out.println(in.isNumeric(s.toCharArray()));
    }
}