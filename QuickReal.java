public class QuickReal {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int first, int last) {
        int pivot = arr[last];
        int i = (first - 1);
        for (int j = first; j < last; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, last);
        return (i + 1);
    }

    static void quicksort(int[] arr,int first,int last){
        if(first<last){
            int pi = partition(arr, first, last);
            quicksort(arr, first, pi-1);
            quicksort(arr, pi+1, last);
        }
    }

    static void print(int[] arr,int n){
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {10,7,8,9,1,5};
        System.out.print("Sebelum di urutkan: ");
        print(arr, arr.length);
        quicksort(arr, 0, arr.length-1);
        System.out.print("Setelah Di urutkan: ");
        print(arr, arr.length);
    }

}
