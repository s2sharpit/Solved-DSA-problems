class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year = new int[101];
        for(int[] log: logs){
            year[log[0]-1950]++;
            year[log[1]-1950]--;
        }

        int max = 0;
        for (int i = 0; i < year.length; i++) {
            if(i>0){
                year[i] += year[i-1];
            }
            if(year[i]>year[max]){
                max = i;
            }
        }
        return max+1950;
    }
}