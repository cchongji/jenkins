package com.mk.lang;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils; 

public class App 
{
    protected int[] intArray1 = { 1, 5, 6, 9 };
    protected int[] intArray2 = { 2, 3, 8, 10 };
    protected String str1 = "12345"; 
    protected String str2 = "ABCDEFG"; 
    
    public App(String str1,String str2,int a,int b) {
    	int i, j;
    	i = j = 0;
    	while(i<intArray1.length) {
    		if(intArray1[i]<a) {
    			i++;
    		}
    		break;
    	}
    	while(j<intArray2.length) {
    		if(intArray2[i]<b) {
    			j++;
    		}
    		break;
    	}
    	intArray1[i] = a;
    	intArray2[j] = b;
    	this.str1 = str1;
    	this.str2 = str2;
    }
    
    public boolean isNumOn(App app) {
    	boolean isNumOn = false;
    	if(ArrayUtils.contains(intArray1, 8)==true)
    		if(ArrayUtils.contains(intArray2, 4)==true)
    		isNumOn = true;
    	return isNumOn;
    }
    
    public String getString(App app) {
    	String str = "No the same num is on the array";
    	if (isNumOn(app)) {
    		if(StringUtils.isNumeric(str1)==true) {
    			str = "str1 isNumeric";
    			if(StringUtils.isNumeric(str2)==true)
    				str = "Both str isNumeric";
    		}
    		else if(StringUtils.isNumeric(str2)==true) 
        	str = "str2 isNumeric";
    	}
    	else 
    		str = "No the same num is on the array";
    return str;
    }
    
    public boolean isSort(int[] intArray1) {
    	boolean isSort = false;
    	int j = intArray1.length;
    	int i = 0;
    	while(i < j) {
    		if(intArray1[i]<=intArray1[i+1]) {
    			i++;
    		}
    		else break;
    	}
    	i = i+1;
    	if (i == j-2) {
    		isSort = true;
    	}
    	return isSort;
    }
}