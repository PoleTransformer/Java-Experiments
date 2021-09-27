import java.util.Arrays;
public class sorting {
    public static void main(String[] args) {
        int[] unsorted = {7,2,3,5,8,3,5,6,1};
        int n = unsorted.length;
        bubbleSort(unsorted, n);
        System.out.println(Arrays.toString(unsorted));
    }   
    static void bubbleSort(int[] unsorted, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < (n-i); j++) {
                if(unsorted[j-1] > unsorted[j]) {
                    swap(unsorted,j-1,j);
                }
            }
        }
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}