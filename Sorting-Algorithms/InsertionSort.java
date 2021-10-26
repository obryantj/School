public class InsertionSort extends Sorts {

    public InsertionSort(int[] A){
        setMethod("Insertion Sort");
        setStart(System.nanoTime());
        insertionSort(A);
        setEnd(System.nanoTime());
        setTime();
     }

    public static void insertionSort(int[] A){
        int j = 0;
        int l = A.length - 1;
        while (j<l){
            j+=1;
            int key = A[j];
            int i = j - 1;
            while(i>=0 && A[i]>=key){
                A[i+1] = A[i];
                i -= 1;
            }
            A[i+1] = key;
        }
    }
}
