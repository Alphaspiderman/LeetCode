class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> m = new HashMap<>();
        int start = 0;
        int soln = 0;
        for (int i = 0; i < fruits.length; i++) {
            m.put(fruits[i], m.getOrDefault(fruits[i], 0) + 1);
            while (m.size() > 2) {
                int f_start = fruits[start];
                m.put(f_start, m.get(f_start) - 1);
                if (m.get(f_start) == 0) {
                    m.remove(f_start);
                }
                start++;
            }
            soln = Math.max(soln, i - start + 1);
        }
        return soln;
    }
}