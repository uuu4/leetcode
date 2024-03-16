bool isPalindrome(int x) {
    if (x < 0) {
        return false;  // Negative numbers are not palindromes
    }

    int digitCounter = (x == 0) ? 1 : 0;
    int temp = x;

    while (temp != 0) {
        temp /= 10;
        digitCounter++;
    }

    char *str = (char *)malloc(sizeof(char) * (digitCounter + 1));  // +1 for the null terminator
    sprintf(str, "%d", x);

    bool flag = true;

    for (int i = 0, j = digitCounter - 1; i < j; i++, j--) {
        if (str[i] != str[j]) {
            flag = false;
            break;
        }
    }

    free(str);

    return flag;
}
