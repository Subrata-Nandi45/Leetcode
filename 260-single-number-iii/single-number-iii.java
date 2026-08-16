class Solution 
{
    public int[] singleNumber(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        int[] result=new int[2];
        int idx=0;
        for(int num:nums)
        {
            if(map.get(num)==1)
            {
                result[idx++]=num;
                if(idx==2) break;
            }
        }
        return result;

    }
}