class Solution {
    public int pivotInteger(int n) {
        int sum = n*(n+1)/2;
        int pivot = (int)Math.pow(sum,0.5);
        if(pivot*pivot == sum){
            return pivot;
        }  
        return -1;
    }
}