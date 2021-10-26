public class RevQuickSort extends Sorts {

    public RevQuickSort(int[] A){
        setMethod("Reverse Quick Sort");
        setStart(System.nanoTime());
        reverseQuickSort(A);
        setEnd(System.nanoTime());
        setTime();
     }
     public static void reverseQuickSort(int[] A){
        int r = A.length-1;
        rqs(A,0,r);
    }  
    public static void rqs(int[] A, int p, int r){
        if(p<r){
            int q = reversePartition(A, p, r);
            rqs(A,p, q-1);
            rqs(A, q+1, r);
        }
    }
    public static int reversePartition(int[] A, int p, int r){
        int x = A[r];
        int i = p - 1;
        for (int j = p; j < r; j++){
            if (A[j] >= x){ // all i changed was this lol
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
