public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int t=sc.nextInt();
        int i=0;int[] min=new int[10];        int[] a=new int[50];

       // System.out.println("enter array elements");
       
        System.out.println("enter the number to delete the digits");
        int k=sc.nextInt();
        int n=t;
        while(n!=0)
        {count++;
            int n1=n%10;
            a[i]=n1;
            System.out.println(" "+a[i]);
            n=n/10;i++;
            
        }   System.out.println("count"+count);   
        //a = new int[count];
        //for( i=0;i<count;i++)
        //System.out.println("size"+a[i]);
 
        for( i=count;i<k;i--){
            a[i]=0;}
        k=0;
               for( i=0;i<count-1;i++)
               {
                  // System.out.println("array "+a[i]);
                    if(a[i]!=0)
                    {if(a[i]<a[i+1])
                    { min[k]=a[i];k++;}
                       else
                    { min[k]=a[i+1];
                        k++;continue;
                    }
                   }  
               }
        System.out.println(" "+min[0]+" "+min[1]);
        
        
    }