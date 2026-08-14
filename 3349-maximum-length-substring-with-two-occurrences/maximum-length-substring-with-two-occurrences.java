class Solution {
    public int maximumLengthSubstring(String s) 
    {
        int ans=0;
        int slow=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int fast=0;fast<s.length();fast++)
        {
            char ch=s.charAt(fast);
            //adding char
           map.put(ch,map.getOrDefault(ch,0)+1);
           //when the window is invalid
           while(map.get(ch)>2)
           {

            char left=s.charAt(slow);
            map.put(left,map.get(left)-1);
            slow++;

           }
           ans=Math.max(ans,fast-slow+1);

        }
        return ans;
    }
}