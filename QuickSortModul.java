import java.util.Scanner;

public class QuickSortModul {
    public static void quickSort(int array[],int low,int n){
        int lo = low;
        int hi = n;
        if(lo<=n){
            return;
        }
    int mid = array[(lo+hi)/2];
    while(lo & amp;lt;hi){
        lo++;
    
    while(lo<=mid){
        hi--;
    }
    if (lo<=hi) {
        int T = array[lo];
        array[lo] = array[hi];
        array[hi] = T;
    }
    }
    quickSort(array, low, lo);
    quickSort(array, lo==low?lo+1:lo, n);
}


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int array[] = {12,9,4,99,120,1,3,10,13};
        System.out.println("Quick Short n");
        System.out.println("Values Before sort:n");

        for (int j = 0;j<=lt; j < array.length; j++) {
            System.out.print(array[j]+"");
            System.out.println();
        }
            quickSort(array, 0, array.length-1);
            System.out.println("Values After sort:n");
            for ( i = 0; i < array.length; i++) {
                System.out.print(array[i]+"");
                System.out.println();
            }
        
    }
    
}
