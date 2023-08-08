import java.util.*;

class ArrayOp {

    static int sum(int arr[],int n){
        int s=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
        }
        return s;
    }

     static int max(int arr[],int n){
        int m=0;
        for(int i=0;i<n;i++){
           if(m<arr[i]){
            m=arr[i];
           }
        }
        return m;
    }

    static int min(int arr[],int n){
        int m=arr[0];
        for(int i=0;i<n;i++){
           if(m>arr[i]){
            m=arr[i];
           }
        }
        return m;
    }

    static void sort(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[j]<arr[i]){
                    int x =arr[j];
                    arr[j]=arr[i];
                    arr[i]=x;
                }
            }

        }
        for(int i=0;i<n;i++){
              System.out.println(arr[i]+" ");
        }
    }

    static int Avg(int arr[],int n){
        int s=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
        }
        return s/n;
    }

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n = scan.nextInt(); 
        
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter arr["+i+"]");
            arr[i]= scan.nextInt();   
        }
//TRAVERSAL
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");  
        }
//SUM
        int sum=sum(arr,n);
        System.out.println("The sum of all elements:"+sum);
//MAXIMUM
        int maxm=max(arr,n);
        System.out.println("The maximum of all elements:"+maxm);
//MINIMUM
        int minm=min(arr,n);
        System.out.println("The minimum of all elements:"+minm);
//SORT 
        sort(arr,n);
// AVERAGE
        int avg= Avg(arr,n);
         System.out.println("The average of all elements:"+avg);    

    }    
}
