char stack[10000];
int top;
void push(char ch)
{
    stack[++top]=ch;
}

char pop()
{
    return stack[top--];
}
bool isValid(char* s) {
    top=-1;
    int len=strlen(s);
    for(int i=0;i<len;i++)
    {
        if(s[i]=='('||s[i]=='['||s[i]=='{')
        {
            push(s[i]);
        }
        else
        {
            
            if(top==-1)
                return false;
            char ch=pop();
            if(s[i]==')'&& ch!='(')
                return false;
            if(s[i]==']'&& ch!='[')
                return false;
            if(s[i]=='}'&& ch!='{')
                return false;
            

        }
    }
    return top==-1;   
    
}