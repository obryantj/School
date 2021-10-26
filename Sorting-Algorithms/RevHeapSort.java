public class RevHeapSort extends Sorts{

    public RevHeapSort(int[] A){
        setMethod("Reverse Heap Sort");
        setStart(System.nanoTime());
        reverseHeapSort(A);
        setEnd(System.nanoTime());
        setTime();
    }
    public static void reverseHeapSort(int[] A){
        reverseBuildMaxHeap(A);
        int heap_size = A.length - 1;
        for (int i = heap_size; i >= 0; i--){
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            heap_size -= 1;
            reverseMaxHeapify(A, 0, heap_size);
        }
    }
    public static void reverseBuildMaxHeap(int[] A){
        int heap_size = A.length - 1;
        int half_heap_size = (int) Math.floor(heap_size / 2);
        for (int i = half_heap_size; i >= 0; i--){
            reverseMaxHeapify(A, i, heap_size);
        }
    }
    public static void reverseMaxHeapify(int[] A, int i, int kill){

        int heap_size = A.length - 1;
        int smallest = i;
        int l = 2*i + 1; // left child
        int r = 2*i + 2; // right child
        try{
            if(l<=heap_size && A[l] < A[smallest] && l<=kill){
                smallest = l;
            }
            if(r<=heap_size && A[r] < A[smallest] && r<=kill){
                smallest = r;
            }
            if (smallest != i){
                int temp = A[i];
                A[i] = A[smallest];
                A[smallest] = temp;
                reverseMaxHeapify(A, smallest, kill);
            }
        }
        catch(ArrayIndexOutOfBoundsException aioobe){

        }
    }
    
}
