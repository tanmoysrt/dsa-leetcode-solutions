/*
 * @lc app=leetcode id=832 lang=java
 *
 * [832] Flipping an Image
 */

// @lc code=start
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        if(image.length == 0) return image;
        int[][] newimage = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            // Reverse and invert
            int left = 0;
            int right  = image[i].length-1;
            while(left<right){
                newimage[i][right] = invert(image[i][left]);
                newimage[i][left] = invert(image[i][right]);
                left++;
                right--;
            }
            if(left == right) newimage[i][left] = invert(image[i][left]);
        }

        return newimage;
    }

    public int invert(int a){
        if(a==0) return 1;
        return 0;
    }
}
// @lc code=end

