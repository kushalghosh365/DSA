//Divide Two Integers

class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==-2147483648 && divisor==-1){
            int out1 = (dividend * -1) + divisor;
            return out1;
        }
        int out = dividend / divisor;
        return out;
    }
}
