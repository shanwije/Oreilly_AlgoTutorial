import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by shan on 1/29/17.
 */
public class Main {
   static double x = Math.random();

    public static void main(String[] args) {
        getFactors(1000000);
    }

    public static Object[] getFactors(int x){
        List<Integer> list = new ArrayList<>();
        int prime;
        for(int i = 2; i< (int)(Math.sqrt(x));i++){
            list.add(i);
        }
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

        return list.toArray();
    }
}
