// If you use sorting but this will modify the array so this is not considered unless nothing happens
// import java.util.Arrays;
// class Solution {
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i++)
//         {
//             if(nums[i]==nums[i+1])  return nums[i];
//         }
//         return 0;
//     }
// }// This one uses freqency array so this is morally correct
import java.util.Arrays;
class Solution {
    public int findDuplicate(int[] nums) {
        int freq[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)  freq[nums[i]]++;
        for(int i=1;i<nums.length;i++)
        {
            if(freq[i]>1)   return i;
        }
        return -1;
    }
}
