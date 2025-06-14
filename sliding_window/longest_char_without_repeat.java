class Solution {
    public int lengthOfLongestSubstring(String s) {
        //length to calculate teh length of non repeating characters
        int leng = 0;
        int longest = 0;
        //list to store:
        HashSet<character> set = new HashSet<>();        //le and r for sliding window
        int l =0;
        for (int r =0; r<=s.length()-1;r++){
          while (!set.contains(s.charAt(r))){
            set.add(s.charAt(r));
            leng +=1;
          }else{
            l = r;
            longest = Math.min(longest,leng)
            set.remove(s.charAt(l));
          }

        }
        return longest;
}





//abcabcbb
//[a]
//[a,b]
//[a,b,c]
//
