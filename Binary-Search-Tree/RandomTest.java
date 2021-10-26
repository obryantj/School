import java.util.Random;
import java.util.Arrays;

public class RandomTest {
    public static void main(String[] args){
        // make a test array
        int[] A = {0,1,2,3,4,5,};
        int l = A.length;

        // make a random obj
        Random r = new Random();
        for(int i = 0; i < l; i++){
            // swap A[i] with A[random]
            int random = r.nextInt(l);
            int temp_node = A[i];
            A[i] = A[random];
            A[random] = temp_node;
        }
        System.out.println(Arrays.toString(A));
    }
    
}
