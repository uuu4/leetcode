class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive[] = new int[nums.length];
        int counter=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                maxConsecutive[counter]++;
            }
            else{
                counter++;
            }
        }
        int max = maxConsecutive[0]; 
        for (int i = 1; i < maxConsecutive.length; i++) {
            if (maxConsecutive[i] > max) 
                max = maxConsecutive[i]; }
         
        return max; 
        }
}
