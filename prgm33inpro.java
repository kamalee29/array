
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamaleeswari
 */
public class prgm33inpro {
    public static void main(String[] args) {
        String s5;
     String[] s=new String[100];
       int i,j,l=0;
       char[] b=new char[50];
              char[] c=new char[50];

       Scanner sc=new Scanner(System.in);
       s5=sc.nextLine();
       for(i=0;i<s5.length();i++)
       {for(j=i+1;j<s5.length();j++){
           s[l]=s5.substring(i, j);l++;
       }}
       
       
       for(i=0;i<l-1;i++)
       {
           b=s[i].toCharArray();
           c=s[i+1].toCharArray();
           int t=b.length;
           int t1=c.length;
           if(t>t1)
           {
               String p=s[i];
         s[i]=s[i+1];
          s[i+1]=p;
          } if(t==t1)
              
           {
               for(j=0;j<t1;j++)
               {
                   if(b[j]==c[j])
                   {
                       continue;
                   }else if(b[j]>c[j])
                   {
                       String p=s[i];
                       s[i]=s[i+1];
                       s[i+1]=p;
                   }
           }
       }if(t<t1)
           continue;
       
    }for(i=0;i<l;i++)
        System.out.println(""+s[i]);
   
    
}
}