public class RevBubbleSort extends Sorts {

    public RevBubbleSort(int[] A){
        setMethod("Reverse Bubble Sort");
        setStart(System.nanoTime());
        reverseBubbleSort(A);
        setEnd(System.nanoTime());
        setTime();
    }

    public static void reverseBubbleSort(int[] A){
        int l = A.length;
        // traversing left to right
        for (int i = 0; i <= l-1; i++){
            // traversing right to left
            for(int j = l-1; j > i; j--){
                if (A[j] > A[j-1]){ // comparison changes
                    int temp = A[j-1];
                    A[j-1] = A[j];
                    A[j] = temp;
                }
            }
        }
    }
}
