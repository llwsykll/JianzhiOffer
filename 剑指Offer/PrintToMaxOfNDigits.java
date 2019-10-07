public class PrintToMaxOfNDigits{
    public static void printN(int n) {
        if (n <= 0) {
            return ;
        }
        char[] number = new char[n];
        for (int i = 0; i < n; i++) {
            number[0] = '0';
        }
        for (int i = 0; i < 10; i++) {
            number[0] = (char)(i + '0');
            printToN(number, n, 0);
        }
    }

    public static void printToN(char[] number, int n, int index) {
        if (index == n-1){
            printNumber(number);
            return ;
        }
        for (int i = 0 ; i < 10; i++) {
            number[index + 1] = (char)(i + '0');
            printToN(number, n, index + 1);
        }
    }
    public static void printNumber(char[] number) {
        boolean isBeginning0 = true;
        int nLength = number.length;
        for (int i = 0; i < nLength; ++i) {
            if(isBeginning0 && number[i]!='0'){
                isBeginning0 = false;
            }
            if(!isBeginning0){
                System.out.print(number[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printN(2);
    }
}