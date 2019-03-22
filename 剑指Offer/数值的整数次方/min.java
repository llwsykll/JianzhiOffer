public class Solution {
    public double Power(double base, int exponent) {
        double res = 1.0;
        boolean isna = false;
        if(exponent<0){
            isna = true;
            exponent = Math.abs(exponent);
        }
        while(exponent>0){
            res *= base;
            exponent--;
        }
        return isna == true?1/res:res;
  }
}