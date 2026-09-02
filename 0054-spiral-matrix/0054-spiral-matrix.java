import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List <Integer> list = new ArrayList<>();

        int minR =0;
        int maxR = matrix.length-1;
        int minC = 0;
        int maxC= matrix[0].length-1;


        int n = matrix.length * matrix[0].length;
        int cnt = 0;



     while(cnt<n)
     {
        //top
        for(int i= minC; i<=maxC && cnt<n; i++){
            list.add(matrix[minR][i]);
            cnt++;
        }
        //right
        for(int i=minR+1; i<= maxR && cnt<n; i++){
            list.add(matrix[i][maxC]);
            cnt++;
        }
        //bottom
        for(int i=maxC-1 ; i>=minC && cnt<n ; i--){
            list.add(matrix[maxR][i]);
            cnt++;
        }
        //left
        for(int i=maxR-1; i>minR && cnt<n ; i--) {
            list.add(matrix[i][minC]);
            cnt++;
        }

        // update boundaries
         minR++;
         maxR--;
         minC++;
         maxC--;
     }

        return list;
    }
}