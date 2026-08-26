class Solution 
{
    public int sumofsquaredigit(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+(digit*digit);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) 
    {
        //required
        //slow,fast pointing to n
        // a function which return sum of sqaure of digits
        
       int slow=n;
       int fast=n;
       while(fast!=1)
        {
            slow=sumofsquaredigit(slow);
            fast=sumofsquaredigit(sumofsquaredigit(fast));

             if(fast==1){
                return true;
            }

            if(slow==fast){
                return false;
            }

           
        }
        return true;
    }
}