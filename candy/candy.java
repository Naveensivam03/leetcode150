import java.util.*;
class Solution {
    public int candy(int[] ratings) {
    int[] candy = new int[ratings.length];
    int l = 0;
    int r = 2;
    Arrays.fill(candy , 1);

    //check for the sliding window condition and check
    //first check it in left to right:
    for (int i =0;i<ratings.length -1;i++){
      //check for each i and i+1 th element;
      if(ratings[i]>ratings[i+1]){
        if (candy[i]<=candy[i+1]){
          candy[i]=candy[i+1]+1;
        }
      }
      else if(ratings[i]<ratings[i+1]){
        if (candy[i]>=candy[i+1]){
          candy[i+1]=candy[i]+1;
        }
      }
    }

    //to check from teh right to left:
    for (int i=ratings.length-1;i>0;i--){
      if (ratings[i]>ratings[i-1]){
        if(candy[i]<=candy[i-1]){
          candy[i]=candy[i-1]+1;
        }
      }else if(ratings[i]<ratings[i-1]){
        if (candy[i]>=candy[i-1]){
          candy[i-1]=candy[i]+1;
        }
      }
    }
    
    int total = 0;
    for(int c :candy){
      total+=c;
    }
    return total;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] testRatings = {
            {1, 0, 2},           // Expected: 5
            {1, 2, 2},           // Expected: 4
            {1, 3, 2, 2, 1},     // Expected: 7
            {1, 2, 3, 4, 5},     // Expected: 15
            {5, 4, 3, 2, 1},     // Expected: 15
            {1},                 // Expected: 1
            {1, 3, 4, 5, 2},     // Expected: 11
            {1, 3, 4, 3, 2, 1},  // Expected: 13
            {1, 6, 10, 8, 7, 3, 2} // Expected: 18
        };

        for (int i = 0; i < testRatings.length; i++) {
            int result = sol.candy(testRatings[i]);
            System.out.println("Test Case " + (i + 1) + ": " + result);
        }
    }

}


