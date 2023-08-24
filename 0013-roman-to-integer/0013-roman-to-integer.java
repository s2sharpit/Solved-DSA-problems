class Solution {
    public int romanToInt(String s) {
        int[] syms = new int[22];
        syms['M' - 'C'] = 1000;
        syms['D' - 'C'] = 500;
        syms['C' - 'C'] = 100;
        syms['L' - 'C'] = 50;
        syms['X' - 'C'] = 10;
        syms['V' - 'C'] = 5;
        syms['I' - 'C'] = 1;
        int num = 0;
        int pre = 1000;
        for (char c : s.toCharArray()){
            int n = syms[c - 'C'];
            if (pre < n) num -= 2*pre;
            num += n;
            pre = n;
        }
        return num;
    }
}