class Solution {
    public int ncr(int n,int r)
    {
        int ans=1;
        for(int i=0;i<r;i++)
        {
            ans=ans*(n-i);
            ans=ans/(i+1);
        }
        return ans;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> abt=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                abt.add(ncr(i,j));
            }
            res.add(abt);
        }
        return res;
    }
}