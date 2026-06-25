int value(char c)
{
    if(c=='I')return 1;
    if(c=='V')return 5;
    if(c=='X')return 10;
    if(c=='L')return 50;
    if(c=='C')return 100;
    if(c=='D')return 500;
    if(c=='M')return 1000;
    return 0;
}
int romanToInt(char* s) {
    int len=strlen(s);
    int num=0;
    for(int i=0;i<len;i++)
    {   
        int cur=value(s[i]);
        int nxt=value(s[i+1]);
        if(cur<nxt)
        {
            num=num-cur;
        }
        else
        {
            num=num+cur;
        }
    }

    return num;
}