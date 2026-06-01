class Solution {
    public int maxProduct(int[] nums) {
        int minprod=nums[0];
        int maxprod=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int c1=minprod*nums[i];
            int c2=maxprod*nums[i];
            minprod=Math.min(nums[i],Math.min(c1,c2));
            maxprod=Math.max(nums[i],Math.max(c1,c2));
            max=Math.max(max,maxprod);

        }
        return max;
    }
}