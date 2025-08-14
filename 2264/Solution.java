class Solution {
    public String largestGoodInteger(String num) {
        int highest = -1;
        for (int i = 0; i < num.length() - 2; i++) {
            if ((num.charAt(i) == num.charAt(i + 1)) && (num.charAt(i) == num.charAt(i + 2))) {
                highest = Math.max(highest, num.charAt(i) - '0');
            }
        }
        if (highest == -1) {
            return "";
        } else if (highest == 0){
            return "000";
        }
        return String.valueOf(highest * 111);
    }
}