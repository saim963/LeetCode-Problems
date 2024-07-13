class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int[] arr: mat){
            for(int el: arr){
                list.add(el);
            }
        }
        if(list.size() != r*c)  return mat;
        int[][] matrix = new int[r][c];
        int k =0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = list.get(k);
                k++;
            }
        }
        return matrix;
    }
}