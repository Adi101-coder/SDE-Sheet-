class Solution {
    public void sortColors(int[] nums) {
        int z=0,o=0,t=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)  z++;
            else if(nums[i]==1) o++;
            else t++;
        }
        int ind=0;
            while(z!=0)
            {
                nums[ind++]=0;
                z--;
            }
            while(o!=0)
            {
                nums[ind++]=1;
                o--;
            }
            while(t!=0)
            {
                nums[ind++]=2;
                t--;
            }
    }
}

// Too much unorthodox use this when sorting aint allowed else just go for sorting