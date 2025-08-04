class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highest = 0;
        for (int val : candies) {
            highest = Math.max(val, highest);
        }
        List<Boolean> soln = new ArrayList<>();
        for (int val : candies) {
            soln.add(highest - val <= extraCandies);
        }
        return soln;
    }
}