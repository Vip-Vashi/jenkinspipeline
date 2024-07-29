package com.testing.junitsample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int CompareString( String str1, String str2)
    {
        if(str1.equals(str2))
        {
        	return 1;
        
        }
        
        else {
			return 0;
		}
    }
    
    public static int sum(int val[]) {
    	
    	int result=0;
    	for(int i=0;i<val.length;i++) {
    		result+=val[i];
    	}
    	return result;
    	
    }
}
