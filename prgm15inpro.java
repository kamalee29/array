/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamaleeswari
 */import java.util.*;
public class prgm15inpro {
    public static void main(String[] args) {
        int[] a=new int[5];
       //  char[] b=new char[5];
          int[] b=new int[5];
        int i,j,k=0,count=0,count1=0,p,q;
        String[] s=new String[5];
        char c;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {a[i]=sc.nextInt();}
        for(i=0;i<5;i++)
        {
           s[i]=Integer.toBinaryString(a[i]);
        }
         for(i=0;i<s.length;i++)
        {count=0;
        int t=s[i].length();
            for(j=0;j<t;j++)
        {c=s[i].charAt(j);
            if(c=='1')
            {count++;
            b[i]=count;
                
            }
        }
        }
        for(p=0;p<b.length;p++)
        {        for(j=p+1;j<b.length;j++)
        {
            if(b[p]<b[j])
            {
                
                int x=a[p];
            a[p]=a[j];
            a[j]=x;
            }
        }
            
        }    
             for(p=0;p<5;p++)
        {  System.out.println(""+a[p]);}
    }
    
}
