/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
    //mid =start+(end-start)/2
        int start = 1;
        int end = n;
        while(start<=end){
            int mid = start + (end-start)/2;
            int g = guess(mid);//this guess function will either give -1 0  or 1
            if(g==0){
                return mid;
            }else if(g==1){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}