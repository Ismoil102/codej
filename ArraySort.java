import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0; i<n;i++)
        a[i]=sc.nextInt();
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int[] a){
        int tmp=0, k=a.length-2;
        for (int i=0; i<=k;i++){
            for (int j=k; j>=i; j--){
                if (a[j]>a[j+1]){
                    tmp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=tmp;
                }
            }
        }
    }
}

