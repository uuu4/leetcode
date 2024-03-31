class Solution {
   
     
    public int maxPoints(int[][] points) {
     
       int maxCount=0;
        for(int i=0;i<points.length;i++){
            HashMap<Double,Integer> map=new HashMap<>();
            int max=0;
            for(int j=i+1;j<points.length;j++){
                int num=(points[j][0]-points[i][0]);
                int den=(points[j][1]-points[i][1]);
                double slope=(den==0)? Double.POSITIVE_INFINITY:(double)num/den;
                if(slope==0) slope=0;
                map.put(slope,map.getOrDefault(slope,0)+1);
                max=Math.max(map.get(slope),max);
            }
             maxCount=Math.max(maxCount,max);
        }

        return maxCount+1;
    }
}
