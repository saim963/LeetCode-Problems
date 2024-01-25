class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int n = gain.length;
        int[] height = new int[n+1];
        for(int i=0; i<n; i++){
            sum += gain[i];
            height[i+1] = sum;
        }
        Arrays.sort(height);
        return height[n];
    }
}