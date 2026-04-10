class Solution {
    public int[] productExceptSelf(int[] nums) {
        int  l = nums.length;
        int pre[]=new int[l];
        pre[0]=1;
        for(int i=1;i<l;i++)
        {
            pre[i]=pre[i-1]*nums[i-1];
        }
        int suff[]=new int[l];
        suff[l-1]=1;
        for(int i=l-2;i>=0;i--)
        {
            suff[i]=suff[i+1]*nums[i+1];
        }
        int res[]=new int[l];
        for(int i=0;i<l;i++)
        {
            res[i]=pre[i]*suff[i];
        }
        return res;
    }
}