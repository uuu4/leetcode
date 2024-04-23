import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int temp;
    
        for(int i=0;i<candies.length;i++){

            int max = Integer.MIN_VALUE;
            temp = candies[i];
            candies[i] += extraCandies;

            for(int j=0;j<candies.length;j++){
                max = Math.max(max, candies[j]);
            }
            if(max == candies[i]) result.add(true);
                else result.add(false);
                candies[i] = temp;
        }
        return result;
    }
}
