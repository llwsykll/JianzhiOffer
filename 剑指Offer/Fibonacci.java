public class Fibonacci {
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int one = 0; 
        int two = 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            int temp = two;
            two += one;
            one = temp;
        }
        return two;
    }
}