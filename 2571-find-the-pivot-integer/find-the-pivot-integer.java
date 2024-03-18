class Solution {
    public int pivotInteger(int n) {
        //was kind off logical
        int sum = n*(n+1)/2;
        int pivot = (int)Math.pow(sum,0.5);
        return (pivot*pivot) == sum ? pivot:-1;
    }
}