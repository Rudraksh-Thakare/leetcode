bool isPalindrome(int x) {
    if(x<0)
    {
        return false;
    }
    int num=x;
    long long reversed=0;
    while(num>0)
    {
        int digit=num%10;
        reversed=reversed*10+digit;
        num=num/10;
    }
    if(x==reversed)
    {
        return true;
    }
    else
    {
        return false;
    }
}