/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamaleeswari
 */import java.util.*;
public class prgm18inpro {
    public static void main(String[] args) {
        int i,j,count=0,t,sum=0,sum1=0,sum2=0,count1=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total number of coins count");
        t=sc.nextInt();
        System.out.println("enter the sum ");
        int p=sc.nextInt();
        int[] a=new int[t];
        int[] b=new int[t];
                int[] c=new int[t];
        System.out.println("enter the number of coins ");
        for(i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
           // System.out.println("a[] "+a[i]);
        }                int x;
      //  System.out.println("len "+x);
        for(i=0;i<t;i++)
        { sum=0;count1=0;
        x=a.length;while(x>0){
            sum=sum+a[i];
        x--;}      count1++;
     //   System.out.println("sum "+sum);
 if(p!=sum){
        b[i]=sum;}
       //  System.out.println(" b[] "+b[i]);}
        else{
        count++;
         System.out.println(count1+"times of coin "+a[i]);
        break;}
        }     
        for(i=0;i<t;i++)
        {count1=0;count1++;
            sum1=sum1+b[i];
           // System.out.println("sum1 "+sum1);count1++;
            if(sum1==p){
                        System.out.println(count1+"times of coin"+b[i]+"and "+count+"times of coin"+a[i]);

            count++;
            break;}
        }
                for(i=0;i<t;i++)
                { count1=0; sum2=0;   for(j=0;j<t;j++){
                    int n=b[i];
                sum2=a[j]+n;count1++;
                  //  System.out.println("sum2 "+sum2);
                    if(sum2==p)
                    {
                        count++;
                                System.out.println(count1+"times of coin"+b[i]+"and "+count+"times of coin"+a[j]);
break;
                    }int sum3=a[j]+sum2;
                    if(sum3==p){count1++;
                    count++;
                        System.out.println(count1+"times of coin "+b[j]+"and"+count+"times of coin "+a[i+1]);
                        break;
                    }
                   n=0;
                }}
                
        System.out.println("count1 "+count1);
                
    }
}
