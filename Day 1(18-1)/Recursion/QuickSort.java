import java.util.Scanner;

public class QuickSort {

    public static void quickSort(int[] a, int start, int end) {
        if(start >= end){
            return;
        }
        int p = partition(a,start,end);

        quickSort(a, start, p-1);
        quickSort(a, p+1, end);
    }

    public static int partition(int[] a, int start,int end){
        int pivot = a[start];
        int i = start;
        int j = end;
        while(i < j) {
            while(a[i] <= pivot) {
                i++;
            }
            while(a[j] > pivot) {
                j--;
            }
            if(i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp; 
            }
        }
        int temp = a[j];
        a[j] = pivot;
        a[start] = temp;
        return j;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        quickSort(a,0,n-1);
        for(int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
