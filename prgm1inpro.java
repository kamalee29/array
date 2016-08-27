/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamaleeswari
 */import java.util.*;
public class prgm1inpro {
    public static void main(String[] args) {
        int i,k=0;
        int[] a=new int[20];
        for(i=0;i<20;i++)
        {
         a[i]=i;   
        }for(i=0;i<20;i++)
        {
            if(a[k]!=i)
                System.out.println(""+k);
            k++;
        }
    }
  
}
