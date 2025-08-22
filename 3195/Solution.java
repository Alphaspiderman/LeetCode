class Solution {
    public int minimumArea(int[][] grid) {
        int min_i = 9999;
        int min_j = 9999;
        int max_i = 0;
        int max_j = 0;
        for(int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == 1){
                    min_i = Math.min(min_i, i);
                    min_j = Math.min(min_j, j);
                    max_i = Math.max(max_i, i);
                    max_j = Math.max(max_j, j);
                }
            }
        }
        return (max_i - min_i + 1) * (max_j - min_j + 1);
    }
}