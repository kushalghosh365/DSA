class Solution {
    public int search(int[] nums, int target) {
        int num = nums.length;
        
            for(int i=0; i<num; i++){
                if(target==nums[i]){
                    return i;
                }
            }
        return -1;
    }
}
