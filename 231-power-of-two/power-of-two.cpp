class Solution {
public:
    bool isPowerOfTwo(int n) {
        //Bitwise AND Operation 
        return (n > 0) && (n & (n - 1)) == 0;
    }
};