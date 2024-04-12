class Solution {
    public int[] findArray(int[] pref) {
        int[] ret = new int[pref.length];
        if (pref.length == 1) return pref;
        int mask = 0;
        for (int i = 0; i < pref.length; i++) {
            ret[i] = pref[i]^mask;
            mask = pref[i];
        }
        return ret;
    }
}
