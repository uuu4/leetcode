class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr[] = new int[nums.length];
        int curIndex =0;
        for(int i=0;i<nums.length;i++){ // We put even integers first
            if(nums[i]%2==0){
                arr[curIndex] = nums[i];
                curIndex++;
            }
        }
        for(int i=0;i<nums.length;i++){ // Now we put odd integers after evens
            if(nums[i]%2!=0){
                arr[curIndex] = nums[i];
                curIndex++;
            }
        }
        // System.gc(); // Garbage collector for decrease the memory usage
        return arr;
    }

}
