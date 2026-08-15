class Solution 
{
    public int longestSubsequence(int[] nums) 
    {
       int n=nums.length;
       int ans=0;
       boolean allzero=true;
       for(int num:nums)
       {
        ans=ans^num;
        if(num!=0)
        {
            allzero=false;
        }
       }
       if(allzero){
        return 0;
       }
       if(ans==0){
        return n-1;
       }
       else{
        return n;
       }
        
    }
}