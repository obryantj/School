public class SelectionSort extends Sorts{
    

    public SelectionSort(int[] A){
       setMethod("Selection Sort");
       setStart(System.nanoTime());
       selectionSort(A);
       setEnd(System.nanoTime());
       setTime();
    }

    public static void selectionSort(int[] A){
        
        int l = A.length;
        // traversing left to right 
        // with the left part being sorted
        // looking for min or max
        for(int i = 0; i < l-1; i++){
            int min = i;
            for(int j = i+1;j<l;j++){
                if(A[j] < A[min]){
                    min = j;
                }
            }
            if(i!=min){
                // swap A[min] and A[i]
                int temp = A[min];
                A[min] = A[i];
                A[i] = temp;
            }
        }
    }

}
