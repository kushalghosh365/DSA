//count-and-say

class Solution {
    public String countAndSay(int n) {
      if(n==0) return "";
  if(n==1) return "1";
  if(n==2) return "11";
 String value="1";
 for(int i=0;i<n-1;i++)
 {
     StringBuilder temp=new StringBuilder(); 
     Character prev=value.charAt(0);
     int times=1;
   for(int j=1;j<value.length();j++)
     {
       
         if(value.charAt(j)==prev)
         {
             times++;   
         }
         else
         {
        
         temp.append(times);
         temp.append(prev);
         prev=value.charAt(j);
         times=1;
         }
     }
     temp.append(times);//1
     temp.append(value.charAt(value.length()-1));
     value=temp.toString();
     
 }
    return value;
}    
}
