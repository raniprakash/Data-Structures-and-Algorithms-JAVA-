package CollectionFramework.ArrayList;
import java.util.*;

public class SampleProgram {
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>(10);
        ArrayList<Integer> arr2=new ArrayList<>(Arrays.asList(1,2,3));

        arr1.add(10);
        System.out.println(arr1);

        arr1.add(0,20);
        System.out.println(arr1);

        arr1.addAll(arr2);
        System.out.println(arr1);

        System.out.println(arr1.contains(20));
        System.out.println(arr1.contains(25));

        System.out.println(arr1.get(3));

        System.out.println(arr1.indexOf(2));

        System.out.println();
        //iteration through ArrayList
        for (int i=0;i<arr1.size();i++)
            System.out.println(arr1.get(i));

        System.out.println();
        Iterator<Integer> it=arr1.iterator();
        while(it.hasNext())
            System.out.println(it.next());

//ListIterator is bidirectional whereas Iterator is unidirectional.


    }

}