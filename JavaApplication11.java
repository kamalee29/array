/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author kamaleeswari
 */import java.util.*;
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enteer the array size");
        int t=sc.nextInt();
        int count=0,sum=0,sum1=0,count1=0,k=0;
        int[] a=new int[t];
                int[] b=new int[t];
        int[] c=new int[t];

        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        int t1=t/2;
         for(int i=0;i<t1+1;i++)
         {count++;
         b[k]=a[i];
          //   System.out.println("kl "+b[k]);
         sum=sum+b[k];k++;
             
         }k=0;
         int x=sum/count;
       // System.out.println("x "+x);
          for(int i=count;i<t;i++)
          {c[k]=a[i];count1++;
             // System.out.println("k "+c[k]);
              sum1=sum1+c[k];
              k++;
          }        
          int y=sum1/count1;
       // System.out.println("km"+y);
   if(x==y)
   {    // System.out.println("kk");  
        for(int i=0;i<count;i++)
        {
       System.out.println(b[i]);}
                for(int i=0;i<count1;i++)
                {
        System.out.println(c[i]);}
   }  
    }
}
