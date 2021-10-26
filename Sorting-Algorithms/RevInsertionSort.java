public class RevInsertionSort extends Sorts {
    public RevInsertionSort(int[] A){
        setMethod("Reverse Insertion Sort");
        setStart(System.nanoTime());
        reverseInsertionSort(A);
        setEnd(System.nanoTime());
        setTime();
     }
     public static void reverseInsertionSort(int[] A){
        int j = 0;
        int l = A.length - 1;
        while (j<l){
            j+=1;
            int key = A[j];
            int i = j - 1;
            while(i>=0 && A[i]<=key){ // swapped a comparison here
                A[i+1] = A[i];
                i -= 1;
            }
            A[i+1] = key;
        }
    }
    
}
