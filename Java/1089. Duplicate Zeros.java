class Solution {
    public void duplicateZeros(int[] arr) {
        int[] memory = new int[arr.length];
        boolean flag = false;
        int read = 0;
        int write = 0;
        for (int i = 0; i < arr.length; i++){
            if (flag){
                memory[write] = arr[i];
                arr[i] = 0;
                write++;
            } else if (read != write) {
                memory[write] = arr[i];
                arr[i] = memory[read];
                write++;
                read++;
            }

            if (arr[i] == 0) {
                flag = !flag;
            }
        }
    }
}
