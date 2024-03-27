class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) { // Check for minimum length of 3
            return false;
        }
        
        int maxIndex = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }

        int[] arr1 = Arrays.copyOfRange(arr, 0, maxIndex+1);
        int[] arr2 = Arrays.copyOfRange(arr, maxIndex, arr.length); // Note: No need for -1 here

        for (int k = 0; k < arr1.length - 1; k++) {
            if (arr1[k] >= arr1[k + 1]) { // Check for increasing sequence in arr1
                return false;
            }
        }
        if(arr2.length==1 || arr2.length == 0 || arr1.length ==1 || arr1.length ==0){
            return false;
        }

        for (int j = 0; j < arr2.length - 1; j++) {
            if (arr2[j] <= arr2[j + 1]) { // Check for decreasing sequence in arr2
                return false;
            }
        }

        return true; // If all conditions pass, it's a valid mountain array
    }
}
