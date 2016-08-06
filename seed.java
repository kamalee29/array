public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int t=sc.nextInt();int count=t;
        int i=0;//int[] min=new int[10];   
       // int[] a=new int[50];

       // System.out.println("enter array elements");
       
       // System.out.println("enter the number to delete the digits");
       // int k=sc.nextInt();
        int n=t;
        while(n!=0)
        {
            int n1=n%10;
            count=count*n1;
            n=n/10;
            

    }
        System.out.println(""+count);
}