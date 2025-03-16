// 	Power of Three

class Solution {
    public boolean isPowerOfThree(int n) {
        double p = n;
        for(int x=0; x<=30; x++){
            double p1 = Math.pow(3,x);
            if(p==p1){
                return true;
            }
        }
        return false;
    }
}
