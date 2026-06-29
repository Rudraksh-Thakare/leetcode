int lengthOfLastWord(char* s) {
    int l=strlen(s);
    int c=0;
    int i=l-1;
    
    while(i>=0 && s[i]==' ')
    {
        i--;
    }
    while(i>=0 && s[i]!=' ')
    {
        i--;
        c++;
    }
    return c;
    
        
}