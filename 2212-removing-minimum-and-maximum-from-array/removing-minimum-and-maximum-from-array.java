class Solution {
    public int minimumDeletions(int[] nums) 
    {
        //3 possibilities

        //delete from left and right index
        //if delet from left then left count is (left)index+1
        //ans delete from right then right count is nums.length-rightindex

        //delete both from left
        //right index+1

        //delete both from right
        //left index+1
        if(nums.length==1)
        {
            return 1;
        }

        int n=nums.length;
        int max_ele_idx=0;
        int min_ele_idx=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[max_ele_idx])
            {
               max_ele_idx=i;
            }
           if(nums[i]<nums[min_ele_idx])
           {
            min_ele_idx=i;
           }
        }

        int left_index=Math.min(max_ele_idx,min_ele_idx);
         int right_index=Math.max(max_ele_idx,min_ele_idx);

         //now find 3 options
         int separate=(left_index+1)+(n-right_index);
         int both_left=right_index+1;
         int both_right=n-left_index;

         return Math.min(separate,Math.min(both_left,both_right));



        
    }
}