import java.util.*;
public class MergeSort{
    public static void mergeSort(int[] a, int start,int end){
        if(start >= end){
            return;
        }
        int mid = start+(end-start)/2;
        mergeSort(a,start,mid);
        mergeSort(a,mid+1,end);
        merge(a,start,mid,end);
    }
    public static void merge(int[] a, int start, int mid, int end){
        int n = end-start+1;
        int[] arr = new int[n];
        int i = start;
        int j = mid+1;
        int index = 0;
        while(i <= mid && j <= end){
            if(a[i] <= a[j]){
                arr[index++] = a[i++];
            }
            else{
                arr[index++] = a[j++];
            }
        }
        while(i <= mid){
            arr[index++] = a[i++];
        }
        while(j <= end){
            arr[index++] = a[j++];
        }
        for(int ind = 0; ind < n; ind++){
            a[start+ind] = arr[ind];
        }
    }
    public static void main (String[] args){
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        mergeSort(a,0,n-1);
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+" ");
        }
    }
}