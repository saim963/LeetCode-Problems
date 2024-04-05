// class Solution {
//     public boolean isValid(String s) {
//         //ok brackets need to be open, close and same
//         if(s.length()%2!=0) return false;
//         HashMap<Character,Character> map = new HashMap<>();
//         map.put('(',')');
//         map.put('{','}');
//         map.put('[',']');
//         char[] chr = s.toCharArray();
//         int j=0;
//         for(int i=0; i<s.length();i++){
//             if(i<s.length()-1 && s.charAt(i) == s.charAt(i+1))  return false;

//             if(s.charAt(i)=='(')    chr[j]=map.get('(');
//             if(s.charAt(i)=='{')    chr[j]=map.get('{');
//             if(s.charAt(i)=='[')    chr[j]=map.get('[');
//             j++;
//         }
//         boolean flag = false;
//         for(int i=0; i<chr.length-1; i++){
//             if(chr[i] == chr[i+1]){
//                 flag=true;
//                 break;
//             }else flag =false;
//             //)}}) -> {[[{
//         }
//         return flag;
//     }
// }

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
