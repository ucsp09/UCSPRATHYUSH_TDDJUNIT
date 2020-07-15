package com.ucsp09.app;
import java.lang.StringBuilder;

public class App 
{
    public String removeA(String str)
    {
        if(str.length()==0)
            return str;
        else if(str.length()==1)
        {
            if(str.charAt(0)=='A')
            {
                StringBuilder temp=new StringBuilder(str);
                temp.deleteCharAt(0);
                return temp.toString();
            }
            return str;
        }
        else
        {
            if(str.charAt(0)=='A'||str.charAt(1)=='A')
            {
                StringBuilder temp=new StringBuilder(str);
                if(str.charAt(0)=='A'&&str.charAt(1)=='A')
                    temp.delete(0, 2);
                else if(str.charAt(0)=='A')
                    temp.deleteCharAt(0);
                else
                    temp.deleteCharAt(1);
                return temp.toString();
            }
            return str;
        }
    }
}
