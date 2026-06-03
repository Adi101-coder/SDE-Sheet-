class Solution {
    public void reverse(int nums[])
    {
        for(int i=nums.length-1;i>=nums.length/2;i--)
        {
            int temp=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;
        }
    }
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                ind=i;
                break;
            }
        }
        if(ind==-1) reverse(nums);
        else
        {
            for(int i=nums.length-1;i>=ind;i--)
            {
                if(nums[i]>nums[ind])
                {
                    int temp=nums[i];
                    nums[i]=nums[ind];
                    nums[ind]=temp;
                    break;
                }
            }
            for(int i=ind+1;i<nums.length-1;i++)
            {
                for(int j=ind+1;j<nums.length-1;j++)
                {
                    if(nums[j]>nums[j+1])
                    {
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
            }
        }
    }
}