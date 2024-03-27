class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length ==1){
            arr[0] = -1;
            return arr;
        }
        
        for(int i=0;i<arr.length-1;i++){
            int rightMax= -1;
            for(int j=i+1;j<arr.length;j++){
                 if(rightMax<arr[j]){
                    rightMax = arr[j];
                }
                arr[i] = rightMax;
            }
            
        }
        arr[arr.length-1]= -1;
        System.gc();
        return arr;
    }
}
