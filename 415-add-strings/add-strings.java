class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;

        while (len1 >= 0 || len2 >= 0 || carry > 0) {
            int digit1 = len1 >= 0 ? Integer.parseInt(Character.toString(num1.charAt(len1))) : 0;
            int digit2 = len2 >= 0 ? Integer.parseInt(Character.toString(num2.charAt(len2))) : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.append(sum % 10);
            len1--;
            len2--;
        }

        return result.reverse().toString();
    }
}