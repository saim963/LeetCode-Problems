class Solution {
    public int findMaxLength(int[] nums) {
        //will check c0==c1 than subArray is longest equal return count of such SubArrays
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int curr =0;
        int length =0;
        map.put(0,-1);
        for(int i=0; i<n; i++){
            curr += (nums[i]==1)?1:-1;
            if(map.containsKey(curr)){
                length = Math.max(length,i-map.get(curr));
            }else{
                map.put(curr,i);
            }
        }
        return length;
    }
}