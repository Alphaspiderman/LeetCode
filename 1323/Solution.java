class Solution {
    public int maximum69Number(int num) {
        String num_s = String.valueOf(num);
        StringBuilder tmp = new StringBuilder();
        Boolean swapped = false;
        for (int i = 0; i < num_s.length(); i++) {
            char ch = num_s.charAt(i);
            if (ch == '6' && !swapped) {
                tmp.append("9");
                swapped = true;
            } else {
                tmp.append(ch);
            }
        }
        return Integer.parseInt(tmp.toString());
    }
}