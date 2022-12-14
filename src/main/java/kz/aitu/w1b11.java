package kz.aitu;
import java.util.Scanner;
public class w1b11 {
    static int counter(int arr[], int n)
    {
        int d = 1;


        for (int i = 1; i < n; i++)
        {
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;



            if (i == j)
                d++;
        }
        return d;
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int a[] = new int[n];
        for (int i=0;i<n;i++)
            a[i]=scanner.nextInt();
        System.out.println(counter(a, n));
    }
}

