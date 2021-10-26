public class QuickSort extends Sorts{

    public QuickSort(int[] A){
        setMethod("Quick Sort");
        setStart(System.nanoTime());
        quickSort(A);
        setEnd(System.nanoTime());
        setTime();
     }

    public static void quickSort(int[] A){
        int r = A.length-1;
        qs(A,0,r);
    }
    public static void qs(int[] A, int p, int r){
        if(p<r){
            int q = partition(A, p, r);
            qs(A,p, q-1);
            qs(A, q+1, r);
        }
    }
    public static int partition(int[] A, int p, int r){
        int x = A[r];
        int i = p - 1;
        for (int j = p; j < r; j++){
            if (A[j] <= x){
                i += 1;
                //exchange
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }
        }
        //exchange
        int temp = A[r];
        A[r] = A[i+1];
        A[i+1] = temp;
        return i + 1;
    }



}
