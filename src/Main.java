import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by shan on 1/29/17.
 */
public class Main {
//   static double x = Math.random();
//
//    public static void main(String[] args) {
//        getFactors(13);
    static int [] arr = new int[4];

    public static void main(String[] args) {
        System.out.println("array length is : "+arr.length);
        arr[0] =11;
        arr[1] =22;
        arr[2] =33;
        arr[3] =44;

        for(int i = 0; i<arr.length-1;i++){
            System.out.println("i is : "+i);
            System.out.println("i th value is in array : "+arr[i]);
    }


    }

    public static Object[] getFactors(int x){
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

         int prime;
        for(int i = 2; i< (int)(Math.sqrt(x));i++){
            list.add(i);
        }
        list.add((int)(Math.sqrt(x)));
        System.out.println(list);
        for(int i  = 0; i<list.size(); i++){
            if(list.get(i) != null){
                prime = list.get(i);
                for(int j = i+1; j<list.size();j++){
                    System.out.print("j = "+j+","+list.get(j)+" ");
                    if(list.get(j) % prime == 0){
                        list.remove(j);
                    }
                }
            }

        }
        System.out.println("\nprintling");
        System.out.println(list);
      //  arr = new int[list.size()];
        for(int i = 0; i<list.size();i++){
            prime = list.get(i);
            if(x % prime == 0){
                x = x/prime;
                ans.add(prime);
            }
        }
        System.out.println("ans : "+ans);
        return list.toArray();
    }
}
