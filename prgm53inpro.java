/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamaleeswari
 */import java.util.*;
public class prgm53inpro {
    public static void main(String[] args) {
        String s;int i,j,count=0;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        char[] a=s.toCharArray();
        System.out.println(""+s.length());
        System.out.println(""+a.length);
         for(i=0;i<a.length;i++)
        {
            if(a[i]>64||a[i]<91||a[i]>96||a[i]<123||a[i]!=' ')
            {
                count++;
            }
           // System.out.println(""+count);
        }if(a.length==count)
        {
            System.out.println("pnagram");
        }else
            System.out.println("not pnagram");
        
    }
    
}
