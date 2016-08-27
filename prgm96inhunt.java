/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamaleeswari
 */import java.util.*;
public class prgm96inhunt {
    public static void main(String[] args) {
        String s="java";
        char[] a=s.toCharArray();
                int t1=a.length;
                for(int i=0;i<a.length-1;i++)
        {if(a[i]!='a'){
           char t=(char) (a[i]-1);
        System.out.println(""+t);}
        else{
                    System.out.println(""+'z');}
        }
        System.out.println(""+a[t1-1]);
    }
 
}
