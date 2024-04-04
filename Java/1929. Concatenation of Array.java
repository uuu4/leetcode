class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
        }
        int counter=0;
        for(int j=nums.length;j<ans.length;j++){
            ans[j] = nums[counter++];
            
        }
        return ans;
    }

}
