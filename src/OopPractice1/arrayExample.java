package OopPractice1;

import com.sun.source.doctree.SeeTree;

import java.lang.reflect.Array;
import java.util.*;

public class arrayExample {
    public static void main(String[] args) {
        //System.arraycopy()
        //Arrays.copyOf()
        Integer[] arr = {1,2,3,4,5};
        int[] arr2 = new int[6];
        int[] arr3 = new  int[7];
//        arr2 = Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(arr2));

        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(arr));
        Set b = new HashSet(a);
        HashSet c = new HashSet();
        c.add(3);
        System.out.println(c);
        System.out.println();
        System.out.println(a);
        a.add(1);
        System.out.println(a);

        Integer ss = 10;
        ss +=1;
        Integer kk = 11;
        Integer gg = kk +ss;
        System.out.println(ss);
        Integer integer = 10;
    }
}
