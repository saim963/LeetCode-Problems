class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for(String ele: operations){
            switch(ele){
                case "--X":
                    value = value-1;
                break;
                case "++X":
                    value = value+1;
                break;
                case "X--":
                    value = value-1;
                break;
                case "X++":
                    value = value+1;
                break;
            }
        }
        return value;
    }
}