int* plusOne(int* digits, int digitsSize, int* returnSize) {
    // Check for empty input
    if (digits == NULL || digitsSize == 0) {
        *returnSize = 0;
        return NULL;
    }

    // Add 1 to the least significant digit
    digits[digitsSize - 1] += 1;

    // Propagate the carry
    for (int i = digitsSize - 1; i > 0; i--) {
        if (digits[i] >= 10) {
            digits[i] %= 10;
            digits[i - 1] += 1;
        }
    }

    // Check if there's a carry at the most significant digit
    if (digits[0] >= 10) {
        // Need to reallocate and shift array
        digits[0] %= 10;
        int* result = (int*)malloc((digitsSize + 1) * sizeof(int));
        if (result == NULL) {
            // Handle memory allocation failure
            *returnSize = 0;
            return NULL;
        }
        result[0] = 1;
        for (int i = 1; i < digitsSize + 1; i++) {
            result[i] = digits[i - 1];
        }
        *returnSize = digitsSize + 1;
        return result;
    } else {
        *returnSize = digitsSize;
        return digits;
    }
}
