class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //find the common between two arrays
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele: nums1){
            map.put(ele,map.getOrDefault(ele, 0) + 1);
        }
        for(int key: nums2){
            if(map.containsKey(key) && map.get(key)>0){
                list.add(key);
                map.put(key, map.get(key) - 1);
            } 
        }        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}