package org.universal.javaprogramming.interviewQA;

import java.text.CollationKey;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;



class M
{
    int i;
 
    public M(int i)
    {
        this.i = i--;
    }
    
    public void G() throws TimeoutException {
    	System.out.println("parent method");
    }
    
    public static void parent() {
    	System.out.println("static parent method");
    }
    
    public final void parenFinalt() {
    	System.out.println("static parent Final method");
    }
}
 
class N extends M
{
    public N(int i)
    {
        super(++i);
 
        System.out.println(i);
    }
    
    @Override
    public void G() throws ArithmeticException{
    	System.out.println("test Inheritance");
    }
    
   
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        N n = new N(26);
        n.G();
        N.parent();
        n.parenFinalt();
        
        
        
        String text= new String("Hello, My name is Sachin");  
        /* Splits the sentence by the delimeter passed as an argument */  
        String[] sentences = text.split("\\.");  
        System.out.println(Arrays.toString(sentences));  
        
        
        StringBuffer sb=new StringBuffer("Hello");  
        sb.replace(1,4,"Java");  
        System.out.println(sb);//prints HJavalo  
        
        String s1= "A";
        String s2 = "a";
        String s3 = new String("A");
        
        
        Collator collator = Collator.getInstance();
        
        System.out.println(collator.compare(s3, s2));
        System.out.println(s3.compareTo(s2));
        
        
        String[] sArray1 = {"Array", "India","Hello"};
        String[] sArray2 = {"Array", "India","Hello", "Given"};
        
        List<String> str = Arrays.asList(sArray1);
        Collections.sort(str,(p1,p2)->{  
            return p1.compareTo(p2);  
            }); 
        
        
        List<String> str2 = Arrays.asList(sArray2);
        Collections.sort(str2,(p1,p2)->{  
            return collator.compare(p1, p2); 
            });
        
        
        System.out.println(str);
        System.out.println(str2);
        
        
        
    }
}