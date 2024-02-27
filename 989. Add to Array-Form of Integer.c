/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* addToArrayForm(int* num, int numSize, int k, int* returnSize) 
{
    // Count the number of digits in the integer 'k'
    int countDigits = 1, x = k;
    while(x > 9)
    {
        countDigits++;
        x /= 10;
    }

    // Determine the length of the result array
    int len = (numSize >= countDigits)? numSize : countDigits;

    // Allocate memory for the result array
    int* result = malloc(len * sizeof(int));

    // Check for memory allocation failure
    if(result == NULL)
    {
        *returnSize = 0;
        return NULL;
    }

    // Indices for iterating through 'num' and 'result'
    int i = numSize, j = len;
    // Variable to store carry during addition
    int r = 0;
    // Variable to store the result of each addition
    int res;

    // Perform addition of 'num' and 'k', considering carry
    while(i > 0 || k > 0)
    {
        // Add corresponding digits from 'num', 'k', and carry
        res = ((i > 0)? num[--i] : 0) + (k % 10) + r;
        // Update 'k' for the next digit addition
        k /= 10;
        // Store the current digit in the result array
        result[--j] = res % 10;
        // Update carry for the next iteration
        r = res / 10;
    }

    // Handle any remaining carry
    if(r > 0)
    {
        // Allocate memory for a temporary result array with an extra digit
        int* tmp_result = malloc((len + 1) * sizeof(int));

        // Check for memory allocation failure
        if(tmp_result == NULL)
        {
            *returnSize = 0;
            // Free memory allocated for 'result'
            free(result);
            return NULL;
        }

        // Swap pointers to avoid copying elements unnecessarily
        int* swap = result; 
        result = tmp_result;
        tmp_result = swap;

        // Copy elements from tmp_result to result, shifting one position to the right
        for(int i = len - 1; i >= 0; i--)
        {
            result[i + 1] = tmp_result[i];
        }

        // Set the first element to the remaining carry
        result[0] = r;
        // Update the length of the result array
        len++;
    }

    // Set the output parameter 'returnSize' to the final length of the result array
    *returnSize = len;
    // Return the result array
    return result;
}
