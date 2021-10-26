public class BubbleSort extends Sorts {

    public BubbleSort(int[] A){
        setMethod("Bubble Sort");
        setStart(System.nanoTime());
        bubbleSort(A);
        setEnd(System.nanoTime());
        setTime();
     }

    public static void bubbleSort(int[] A){
        int l = A.length;
        // traversing left to right
        for (int i = 0; i <= l-1; i++){
            // traversing right to left
            // bubbling the element to the right of the array
            for(int j = l-1; j > i; j--){
                if (A[j] < A[j-1]){ 
                    int temp = A[j-1];
                    A[j-1] = A[j];
                    A[j] = temp;
                }
            }
        }
    }
    
}
