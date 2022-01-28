import java.util.Arrays;

public class Selection {
    public static void selectionSort(int[] ary){
        for(int i = 0; i < ary.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < ary.length; j++){
                if(ary[j] < ary[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = ary[min];
                ary[min] = ary[i];
                ary[i] = temp;
            }
        }
    }

    public static void main(String[] args){
        int[]ary = {-3, 5, 33, 77, 12, -22};
        selectionSort(ary);
        System.out.println(Arrays.toString(ary));

        ary = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectionSort(ary);
        System.out.println(Arrays.toString(ary));

        ary = new int[]{-13, -7, 3, 4, 4, 11, 13};
        selectionSort(ary);
        System.out.println(Arrays.toString(ary));
    }
}
