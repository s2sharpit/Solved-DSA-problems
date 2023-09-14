class Solution {
    public String longestPalindrome(String s) {
        int low,high;
        String max="";
        //for odd length palindrome
        for(int i=0;i<s.length();i++){
            //taking each element
            String temp=s.charAt(i)+"";
            low=i-1;
            high=i+1;
            while(low>=0 && high<s.length()){
                if(s.charAt(low)==s.charAt(high)){
                    temp=s.charAt(low)+temp+s.charAt(high);
                    low--;
                    high++;
                }else{
                    break;
                }
            }
            if(max.length()<temp.length()){
                max=temp;
            }
        }
        //for even length palindrome
        for(int i=0;i<s.length();i++){
            String temp="";
            low=i;
            high=i+1;
            while(low>=0 && high<s.length()){
                if(s.charAt(low)==s.charAt(high)){
                    temp=s.charAt(low)+temp+s.charAt(high);
                    low--;
                    high++;
                }else{
                    break;
                }
            }
            if(max.length()<temp.length()){
                max=temp;
            }
        }
        return max;
    }
}