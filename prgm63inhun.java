/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamaleeswari
 */import java.util.*;
public class prgm63inhun {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }for(i=0;i<n;i++)
        {for(j=i+1;j<n;j++)
        {
            if(a[i]<a[j])
            {
                System.out.println("a[]"+a[i]+""+a[j]);
                for(int k=j;k<n;k++)
            {int t=a[i];
                System.out.println("t value"+t);
                if(t<a[k])
                {
                    System.out.println("a[k"+a[k]);
                    int temp=a[k];
                a[i]=a[k];
                a[k]=temp;
                }
                    
                    }a[j]=0;
            }
        }}for(i=0;i<n;i++)
        {
            System.out.println(""+a[i]);
        }
        
    }
   
}
