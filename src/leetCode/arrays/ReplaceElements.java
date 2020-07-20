package leetCode.arrays;

public class ReplaceElements {

    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        for(int i=0; i<arr.length-2; i++){
            int max = arr[i+1];
            for(int j = i+1; i<arr.length-2; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            arr[i]=max;
        }
        return arr;
    }
}
