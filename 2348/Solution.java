class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long soln = 0;
        long tmp = 0;
        for (int elem : nums){
            if (elem == 0){
                tmp = tmp + 1;
                soln = soln + tmp;
            } else {
                tmp = 0;
            }
        }
        return soln;
    }
}