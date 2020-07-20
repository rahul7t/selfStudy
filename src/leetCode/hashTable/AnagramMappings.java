package leetCode.hashTable;

import java.util.HashMap;
import java.util.Map;

public class AnagramMappings {

    public static void main(String[] args) {
        AnagramMappings obj = new AnagramMappings();
        int [] A = {12, 28, 46, 32, 50};
        int [] B = {50, 12, 32, 46, 28};
        int[] ints = obj.anagramMappings(A, B);
        for (int i : ints ){
            System.out.println(i);
        }

    }

    public int[] anagramMappings(int[] A, int[] B) {
        int[] soln = new int[A.length];
        Map<Integer, Integer> lookup = new HashMap<Integer, Integer>();
        for(int i = 0; i <A.length ; i++){
            lookup.put(B[i], i);
        }
        for(int i=0 ;i<A.length;i++){
            soln[i]=lookup.get(A[i]);
        }
    return soln;
    }

}
