class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        int freq[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)  freq[nums[i]]++;
        for(int i=1;i<=nums.length;i++)
        {
            if(freq[i]==2)  arr[0]=i;
            else if(freq[i]==0) arr[1]=i;
        }
        return arr;
    }

}