class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int res = 0;
        int basket_count = baskets.length;
        for (int fruit : fruits){
            int is_not_set = 1;
            for (int i = 0; i < basket_count; i++){
                if (fruit <= baskets[i]){
                    baskets[i] = 0;
                    is_not_set = 0;
                    break;
                }
            }
            res = res + is_not_set;
        }
        return res;
    }
}