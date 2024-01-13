class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> res = new ArrayList<>();
        int[] target = new int[nums.length];
        int t = 0;
        for(int i=0; i<nums.length; i++){
            res.add(index[i],nums[i]);
        }
        for(int a : res){
            target[t++] = a;
        }
        return target;
    }
}