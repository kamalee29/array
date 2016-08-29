/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamalee
 */import java.util.*;
public class prgm1inpro {
    public static void main(String[] args) {
        int n1,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of strings");
        n1=sc.nextInt();
        System.out.println("enter the strings");
      String[] st=new String[n1];
      for(i=0;i<n1;i++)
          st[i]=sc.next();
    if(st==null || st.length==0){
        System.out.println(" "); 
    }
 
    if(st.length==1) 
            System.out.println(""+ st[0]);
 
    int minLen = st.length+1;
 
    for(String str1: st){
        if(minLen > str1.length()){
            minLen = str1.length();
        }
    }
 
    for(i=0; i<minLen; i++){
        for(int j=0; j<st.length-1; j++){
            String s1 = st[j];
            String s2 = st[j+1];
            if(s1.charAt(i)!=s2.charAt(i)){
                System.out.println(""+ s1.substring(0, i));
            }
        }
    }
 
        System.out.println(""+ st[0].substring(0, minLen));
}
    }
  

