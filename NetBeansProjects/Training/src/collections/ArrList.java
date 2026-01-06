package collections;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrList {
    public static void main(String[] args){
        Integer []arr = new Integer[]{1,5,8,9,2};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
        
        al.add(5);
        System.out.println(al);
        System.out.println(al.size());
        
        al.set(0, 25);
        
        for(int i = 0 ; i < al.size() ; i++){
            System.out.println(al.get(i));
        }
        
        al.indexOf(1);
        System.out.println(al);
    }
}
