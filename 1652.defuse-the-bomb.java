/*
 * @lc app=leetcode id=1652 lang=java
 *
 * [1652] Defuse the Bomb
 */

// @lc code=start
class Solution {
    public int sumNextNumber(int[] code, int index, int count){
        int start_index = (index+1)%code.length;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + code[(start_index+i)%code.length];
        }
        return sum;
    }

    public int sumPreviousNumber(int[] code, int index, int count){
        int start_index = index-count;
        if(start_index<0){
            start_index = code.length+start_index;
        }
        System.out.println(start_index);
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + code[(start_index+i)%code.length];
        }
        return sum;
    }

    public int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        for (int i = 0; i < code.length; i++) {
            if(k==0) result[i] = 0;
            else if(k>0) result[i] = sumNextNumber(code, i, k);
            else if(k<0) result[i] = sumPreviousNumber(code, i, Math.abs(k));
        }
        return result;
    }
}
// @lc code=end

