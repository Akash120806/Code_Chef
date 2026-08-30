import java.util.*;
import java.lang.*;
import java.io.*;

class PoshShopping
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int sum =0;
            int max=0;
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                max=Math.max(max, arr[i]);
            }
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]<=arr[j])
                    {sum=arr[i]+arr[j];}
                    max=Math.max(max, sum);

                }
            }
              System.out.println(max);
          
            t--;

        }
        sc.close();


        

	}
}
