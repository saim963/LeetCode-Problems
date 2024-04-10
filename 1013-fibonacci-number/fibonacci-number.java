class Solution {
    public int fib(int n) {
        if(n==0 || n==1)    return n;
        return fib(n-1)+fib(n-2);
    }
    //Recursion will always be worse or equal to an iterative approach both time- and memory-wise
}