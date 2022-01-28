import java.util.Arrays;

public class Hard8 {
    public static void shift8s(int[] arr){
        for(int i = 1; i < arr.length; ++i){
            int n = arr[i];
            int j = i;
            while(j>0 && n == 8){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = n;
        }
    }

    public static void main(String[] args){
        int[]ary = {8, 5, 8, 77, 12, 8};
        shift8s(ary);
        System.out.println(Arrays.toString(ary));

        ary = new int[]{9, 8, 8, 6, 3, 8, 4, 2, 1};
        shift8s(ary);
        System.out.println(Arrays.toString(ary));

        ary = new int[]{-13, -7, 8, 8, 4, 8, 8};
        shift8s(ary);
        System.out.println(Arrays.toString(ary));

    }
}
