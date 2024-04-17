class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p=0;
        int n=0;
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int[] res = new int[nums.length];
        for(int el: nums){
            if(el>0)    pos[p++]=el;
            else    neg[n++]=el;
        }
        p=0;
        n=0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0)  res[i]=pos[p++];
            else    res[i]=neg[n++];
        }
        return res;
    }
}