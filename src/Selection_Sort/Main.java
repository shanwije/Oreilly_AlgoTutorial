package Selection_Sort;

/**
 * Created by shan on 1/29/17.
 */
public class Main {
    int [] arr = {124,234,432,788,56,655777,78,56,45433,4};

    public static void main(String[] args) {
        Main m = new Main();
        for(int i: m.arr){
            System.out.print(i+", ");
        }
        System.out.println();
        m.arr = m.sSort(m.arr);
        for(int i: m.arr){
            System.out.print(i+", ");
        }
    }

    public int[] sSort(int [] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    int tmp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = tmp;
                }
            }

        }
        return arr;
    }
}
