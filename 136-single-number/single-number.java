class Solution {
    public int singleNumber(int[] nums) {
        //make hashmap and return the element whose count is one
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int el: nums){
            map.put(el,map.getOrDefault(el,0)+1);
        }
        for(int key: map.keySet()){
            if(map.get(key)==1) return key;
        }
        return -1;

        //using XOR operator
        /*int result = 0;
        for(int num: nums){
            result ^= num;
        }
        return result;*/
    }
}