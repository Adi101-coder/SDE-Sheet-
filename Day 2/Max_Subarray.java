class Solution {
    public int maxSubArray(int[] nums) {
        int sn=0;
        if(nums.length==1)  return nums[0];

        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sn+=nums[i];
            max=Math.max(max,sn);
            if(sn<0)    sn=0;
        }
        return max;
    }
}