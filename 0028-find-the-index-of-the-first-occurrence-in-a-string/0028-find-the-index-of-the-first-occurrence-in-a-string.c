int strStr(char* haystack, char* needle) {

    for(int i=0;i<strlen(haystack);i++)
    {
        int j=0;
        while(j<strlen(needle))
        {
            if(haystack[i+j]==needle[j])
            {
                j++;
            }
            else
            {
                break;
            }
            if(j==strlen(needle))
            
                return i;
        }
        
    }     
   
    return -1;
}