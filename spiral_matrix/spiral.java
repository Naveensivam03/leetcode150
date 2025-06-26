import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //return side
        int top =0;
        int bottom = matrix.length-1;
        int left =0;
        int right = matrix[0].length-1;
        List<Integer> out =new ArrayList<>();
        while(left<=right && top<=bottom){
            //right movement:
            for(int i =left;i<=right ;i++){
                out.add(matrix[top][i]);
            }
            top++;

            //condition to checnck the top and bottom inside the loop itself since it will check once everything runs in the while loop
            if(top>bottom){
                break;
            }

            //bottom movement:
            for(int i =top;i<=bottom;i++){
                out.add(matrix[i][right]);
            }
            right--;
            //condition to checnck the top and bottom inside the loop itself since it will check once everything runs in the while loop

            if(left>right){
                break;
            }


            //left movement:
            for (int i =right;i>=left;i--){
                out.add(matrix[bottom][i]);
            }
            bottom--;
            //condition to checnck the top and bottom inside the loop itself since it will check once everything runs in the while loop
            if (top>bottom){
                break;
            }

            //top movement:
            for (int i =bottom;i>=top;i--){
                out.add(matrix[i][left]);
            }
            left++;
            //condition to checnck the top and bottom inside the loop itself since it will check once everything runs in the while loop
            if (left>right){
                break;
            }
        }
        return out;

    }
}
