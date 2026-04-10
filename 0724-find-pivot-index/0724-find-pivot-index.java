class Solution {
    public int pivotIndex(int[] nums) {
        int t = 0;
        for (int i : nums) {
            t += i;
        }
        int lsum=0,rsum=0;
        for(int i=0;i<nums.length;i++)
        {
            rsum=t-lsum;
            lsum+=nums[i];
             
            
            if(lsum==rsum)
            return i;
        }
        return -1;
    }
}