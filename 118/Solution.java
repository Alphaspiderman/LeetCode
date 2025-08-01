class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> soln = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            temp = new ArrayList<>();
            temp.add(1);

            for (int idx = 1; idx < row; idx++) {
                int val = prev.get(idx - 1) + prev.get(idx);
                temp.add(val);
            }
            if (row > 0) {
                temp.add(1);
            }

            soln.add(temp);
            prev.clear();
            prev.addAll(temp);
        }
        return soln;
    }
}