package com.jd.test.git.jd;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Hello World8" );
        System.out.println( "Hello World9" );
        System.out.println( "Hello World10" );
        System.out.println( "Hello World11" );
    }

    public static void print(String str){
        for(char c :str.toCharArray()){
            System.out.print(c);
        }
    }

    public String sayhello(){
       return "hello";
    }


}
