public class RevMergeSort extends Sorts {
    
    public RevMergeSort(int[] A){
        setMethod("Reverse Merge Sort");
        setStart(System.nanoTime());
        reverseMergeSort(A);
        setEnd(System.nanoTime());
        setTime();
     }
     public static void reverseMergeSort(int[] A){
        int p = 0;
        int r = A.length - 1;
        int[] temp = new int[A.length];
        // make a copy of A
        for(int i =0; i <= r; i++){
            temp[i] = A[i];
        }
        rms(A,temp,p,r);
    }
    public static void rms(int[] A, int[] temp, int p, int r){
        if(p<r){
            int q = (p+r)/2;
            rms(A,temp,p,q);
            rms(A,temp,q+1,r);
            reverseMerge(A,temp,p,q,r);
        }
    }
    public static void reverseMerge(int[] A,int[] temp,int p,int q,int r){
        int i = p;
        int j = q + 1;
        for(int k = p; k<=r;k++){
            temp[k] = A[k];
        }
        for(int k =p; k<=r;k++){
            if(i>q){ // this is a copy
                A[k] = temp[j];
                j+=1;
            }
            else if(j>r){ // this is a copy
                A[k] = temp[i];
                i+=1;
            }
            else if(temp[j] > temp[i]){ // just have to flip this one
                A[k] = temp[j];
                j+=1;
            }
            else{
                A[k] = temp[i];
                i+=1;
            }
        }
    }
}
