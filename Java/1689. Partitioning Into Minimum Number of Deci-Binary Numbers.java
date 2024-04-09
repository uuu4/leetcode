class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(int i=0;i<n.length();i++){
            if(max<(int)n.charAt(i)){
                max=n.charAt(i);
            }
        }
        return max-48;
    }
}
