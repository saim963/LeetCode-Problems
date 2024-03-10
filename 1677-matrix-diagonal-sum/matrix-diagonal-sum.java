class Solution {
    public int diagonalSum(int[][] mat) {
        int answer = 0;
        int len = mat.length;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(i==j || i+j == len-1){
                    answer += mat[i][j];
                }
            }
        }
        return answer;
    }
}