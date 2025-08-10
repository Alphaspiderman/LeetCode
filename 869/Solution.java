class Solution {
    public boolean reorderedPowerOf2(int n) {
        char[] num_arr = String.valueOf(n).toCharArray();
        Arrays.sort(num_arr);
        String num_string = new String(num_arr);
        for (int i = 0; i < 32; i++) {
            char[] i_arr = String.valueOf((int) 1 << i).toCharArray();
            Arrays.sort(i_arr);
            String i_string = new String(i_arr);
            if (i_string.equals(num_string)) {
                return true;
            }
        }
        return false;
    }
}