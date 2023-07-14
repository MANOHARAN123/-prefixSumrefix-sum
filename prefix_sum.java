import java.util.Scanner;





public class prefix_sum {
    static int n;
    public static int[] prefixSum(int arr[])
    {

        int p[]=new int [n];
        p[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            p[i]=p[i-1]+arr[i];
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of array elemments");
        int n=sc.nextInt();g

        int arr[]=new int[n];
        for(int i=0;i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int prefix[]= prefixSum(arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(prefix[i]+" ");
        }

    }
}
