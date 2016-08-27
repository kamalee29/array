/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamaleeswari
 */import java.util.*;
public class prgm95inhun {
    public static void main(String[] args) {
      int n,i,j=0,count=0,k=0,sum=0;
      int[] a=new int[20];int x = 0,y = 0;
          
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the number above 20");
        n=sc.nextInt();int max=0;
        for(i=2;i<n;i++)
        {
         for(j=2;j<i;j++){
             if(i%j==0){
                 break;
             }
         }   
         if(i==j)
        {
          a[k]=i;
           // System.out.println("a[] "+a[k]);
          k++;
        }}for(i=0;i<k;i++)
        {sum=0;
            for(j=i+1;j<k;j++)
        {int t=a[i];
            sum=a[j]+t+sum;
            System.out.println("sum "+sum);
            
          System.out.println("a[i] "+a[i]+"a[j] "+a[j]);
           // for(int p=0;p<k;p++){
            if(sum==n)
            {
              //  System.out.println("sum if "+a[p]);
                
                count++;}
           // }
            if(count>max){
            max=count;
            x=a[i];
            y=a[j];
          //  System.out.println(""+max);
            //    System.out.println(""+a[i]+""+a[j]);
            }
            t=0;
        }
        }  System.out.println(""+max);
                System.out.println(""+x+""+y);
        

    }
    
}
