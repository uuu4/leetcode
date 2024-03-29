class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int isThird = 1; 
        int i= nums.length -1;

        while(isThird < 3 && i > 0){
            if(nums[i] != nums[i-1]){
                isThird ++;
                if(isThird == 3){
                System.gc();
                return nums[i-1]; }
            }
            i--;
        }
        System.gc();
        return max;
    }
}
