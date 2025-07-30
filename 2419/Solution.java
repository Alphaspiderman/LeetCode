class Solution {
    public int longestSubarray(int[] nums) {
        // TODO - Optimize this solution, only beats 7.5%
        int soln = 0;
        int cur_len = 0;
        int max_val = Arrays.stream(nums).max().getAsInt();
        for (int num : nums){
            if (num == max_val){
                cur_len = cur_len + 1;
            } else {
                soln = Math.max(cur_len, soln);
                cur_len = 0;
            }
        }
        return Math.max(cur_len, soln);
    }
}