class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int Tsum = 0;
        int minl = Integer.MAX_VALUE;

        int l =0;
       for (int r =0 ; r <= nums.length -1;r++){
         Tsum+=nums[r];
         while (Tsum>=target){
          minl = Math.min(minl , r-l+1);
          Tsum -= nums[l];
          l++;
         }
       }
    
    
        return (minl == Integer.MAX_VALUE) ? 0: minl;
    }
    }
          




//target =7
//nums =[2,3,1,2,4,3]
//
//
/we just move  the window and check for the target
