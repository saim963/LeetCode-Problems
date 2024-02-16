class Solution {
    public int romanToInt(String s) {
        //We'll move from L to R if element is lesser we reduce else all added
        //e.g. MCMXCIV -> 5-1+100-10+1000-100+1000 -> 1994
        /*
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2; i>=0; i--){
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1)))
                result -= map.get(s.charAt(i));
            else
                result += map.get(s.charAt(i));
        }
        return result;
        */

        //upper approach is of mapping and this lower approach uses only string and performs better
        int value=0, prev=0, cur=0;
        for(int i=s.length()-1; i>=0; i--){
            cur = switch(s.charAt(i)){
                case 'M' -> 1000;
                case 'D' -> 500;
                case 'C' -> 100;
                case 'L' -> 50;
                case 'X' -> 10;
                case 'V' -> 5;
                default -> 1;
            };
            if(cur<prev)    value-=cur;
            else    value+=cur;
            prev=cur;
        }
        return value;
    }
}