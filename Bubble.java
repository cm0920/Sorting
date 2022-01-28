import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bubble {
    public static <T extends Comparable<? super T>> void bubbleSort(List<T> list){
        T s = null;

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size() - 1 - i; j++){
                if(list.get(j).compareTo(list.get(j+1)) > 0){
                    s = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, s);
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter list to sort: ");
        String fName = sc.nextLine();

        File f = new File(fName);
        Scanner read = new Scanner(f);
        String full = "";
        while(read.hasNextLine()){
            String name = read.nextLine();
            String first = name.substring(0, name.lastIndexOf(" "));
            String last = name.substring(name.lastIndexOf(" "));
            full = last + ", " + first;
        }

    }

}
