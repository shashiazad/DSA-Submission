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
        int l = 1;
        int r = n;
        while(l <= r){
            int g = l + (r - l)/ 2;
            int possible = guess(g);
            if(possible == 0){
                return g;
            }else if (possible < 0){
                r = g - 1;
            } else {
                l = g + 1;
            }
        }
        return -1;
    }
}