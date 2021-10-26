public class RevSelectionSort extends Sorts {
    public RevSelectionSort(int[] A){
        setMethod("Reverse Selection Sort");
        setStart(System.nanoTime());
        reverseSelectionSort(A);
        setEnd(System.nanoTime());
        setTime();
     }
     public static void reverseSelectionSort(int[] A){
        int l = A.length;
        for(int i = 0; i < l-1; i++){
            int max = i;
            for(int j = i+1;j<l;j++){
                if(A[j] > A[max]){ // comparison changes
                    max = j;
                }
            }
            if(i!=max){
                // swap A[min] and A[i]
                int temp = A[max];
                A[max] = A[i];
                A[i] = temp;
            }
        }
    }

}
