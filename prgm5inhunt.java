/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamaleeswari
 */import java.util.*;
public class prgm5inhunt {
    public static void main(String[] args) {
        int num=12258,i,j,k=0,t,p=97,p1=96,rev=0,rev1,x;char y;
        int[] a=new int[10];
        int n=num;
        while(n!=0)
        {
             t=n%10;
            a[k]=t;
            System.out.println(""+a[k]);
            n=n/10;
            System.out.println("n "+n);
            k++;
        }
           System.out.println("k "+(k));
       while(p<123)
        {
          x=p-p1;   for(i=0;i<k;i++)
        {
          // System.out.println("kk "+x);
            if(a[i]==(p-p1))
                { y=(char) (x+p1);
                            System.out.println("y val "+y);
                           // System.out.println(""+y);
                }rev=rev+a[i]*10;
                         //   System.out.println("rev val "+rev);
                            if(rev==(p-p1))
                {y=(char) (x+p1);
                    System.out.println(" y1 "+y);
                }
            for(j=i+1;j<k;j++)
            {
                rev1=a[i]*10+a[j];
                          //  System.out.println("rev1 val "+rev1);
                            if(rev1==(p-p1))
                {y=(char) (x+p1);
                    System.out.println(" y2 "+y);
                }
            }
            }p++;
        }
        
    }
  
}
