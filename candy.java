public class ChildrenCandy{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
	int sum=0,flag=1,i;
System.out.println("enter the number");
int n=sc.nextInt();
int[] a=new int[number];
for(i=0;i<number;i++){
a[i]=scr.nextInt();
if(i>0&&a[i]>a[i-1])
         {
	    flag=flag+1;
	     sum+=flag;
	}
else{
      sum+=1;
    flag=1;
   }
}
	System.out.println("Min Chocolates to be required : " +sum);
	
}
}