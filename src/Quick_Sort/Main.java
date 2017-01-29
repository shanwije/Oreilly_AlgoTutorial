package Quick_Sort;

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
            m.arr = m.qSort(m.arr);
            for(int i: m.arr){
                System.out.print(i+", ");
            }
        }

        public int [] qSort(int [] arr){

            int key = arr[0];
            int left = 0;
            int flag =0;
            int right = arr.length-1;
            while(left<right){
                if(arr[left] < key){
                    arr = swap(arr, left, flag);
                    flag++;
                    left++;
                }
                else if(arr[right]>key){
                    arr = swap(arr, left, flag);
                    flag++;
                    right--;
                }
            }
            return arr;
        }
        public int[] swap(int[] a, int x, int y){
            int tmp = a[x];
            a[x] = a[y];
            a[y] = tmp;
            return a;
        }
    }








