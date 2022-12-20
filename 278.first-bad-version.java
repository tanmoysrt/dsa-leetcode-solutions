/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int latestBadVersion = -1;

        while (low <= high) {
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)){
                high = mid-1;
                latestBadVersion = mid;
            }
            else{
                low = mid + 1;
            }
        }

        return latestBadVersion;
    }
}
// @lc code=end

