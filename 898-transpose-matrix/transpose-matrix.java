class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for(int i =0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                newMatrix[i][j] = matrix[j][i];
            }
        }
        return newMatrix;
    }
}