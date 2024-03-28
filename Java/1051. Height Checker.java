class Solution {
    public int heightChecker(int[] heights) {
        int counter=0;
        int[] arr = Arrays.copyOf(heights,heights.length);
        Arrays.sort(arr);
        for(int i=0;i<heights.length;i++){
            if(arr[i]!=heights[i]){
                counter++;
            }
        }
        return counter;
    }
}
