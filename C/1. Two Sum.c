/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int *ptr = (int *)malloc(sizeof(int)*2);
    for(int i=0;i<numsSize;i++){
        for(int j=0;j<numsSize;j++){
            if(nums[i]+nums[j]==target){
                if(i==j)break;
                ptr[0]=i;
                ptr[1]=j;
            }
        }
    }
    *returnSize = 2;
    return ptr;
}
