class Solution {
    public int differenceOfSums(int n, int m) {
        int num1=0;
        int num2=0;
        for(int i=1;i<=n;i++){
            num1=(i % m == 0) ? num1 + i:num1;
            num2=(i % m != 0) ? num2 + i:num2;
        }
        return num2-num1;
    }
}
