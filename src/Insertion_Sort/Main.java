package Insertion_Sort;

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
        m.arr = m.iSort(m.arr);
        for(int i: m.arr){
            System.out.print(i+", ");
        }
    }

    public int [] iSort(int [] arr){

        for(int i =1; i < arr.length; i++){

            for(int j = i; j > 0 && arr[j] < arr[j-1] ; j--){
                //swapping
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
            }
        }
        return arr;
    }
}
