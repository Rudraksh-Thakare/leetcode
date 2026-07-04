char* addBinary(char* a, char* b) {
    int lenA = strlen(a);
    int lenB = strlen(b);

    int maxLen = (lenA > lenB) ? lenA : lenB;

    // +2 because one extra digit may be needed for carry and one for '\0'
    char *result = (char *)malloc((maxLen + 2) * sizeof(char));

    int i = lenA - 1;
    int j = lenB - 1;
    int k = maxLen;
    int carry = 0;

    result[maxLen + 1] = '\0';

    while (i >= 0 || j >= 0 || carry) {

        int sum = carry;

        if (i >= 0)
            sum += a[i--] - '0';

        if (j >= 0)
            sum += b[j--] - '0';

        result[k--] = (sum % 2) + '0';
        carry = sum / 2;
    }

    return result + k + 1;
}