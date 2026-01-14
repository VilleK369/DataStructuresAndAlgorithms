
import java.util.Arrays;
import java.util.Random;

public class App{
    public static void main(String[] args) throws Exception {

        int[] array= new int[10001];
        Random random = new Random();

        for(int i=0; i<=array.length-1; i++){
            array[i]=random.nextInt(1, 10000);
        }

        System.out.println(Arrays.toString(array));

        QuickSortAlgo.quickSort(array, 0, array.length-1);

        System.out.println(Arrays.toString(array));

        QuickSortAlgo.quickSort(array, 0, array.length-1);

        System.out.println(Arrays.toString(array));

    }
}
