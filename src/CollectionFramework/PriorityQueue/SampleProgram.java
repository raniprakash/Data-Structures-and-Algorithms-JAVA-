package CollectionFramework.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<Integer>
{
    public int compare(Integer o1,Integer o2)
    {
        if(o1<o2)return 1;
        if(o1>o2)return -1;
        return 0;
    }
}

public class SampleProgram {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);


        System.out.println(p.peek());

        p.forEach((x)->System.out.println(x));
        p.poll();
        System.out.println("After Deletion");
        p.forEach((x)->System.out.println(x));

        System.out.println();
        System.out.println();

        PriorityQueue<Integer> pq=new PriorityQueue<>(new MyComparator());

        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);


        System.out.println(pq.peek());

        pq.forEach((x)->System.out.println(x));
        pq.poll();
        System.out.println("After Deletion");
        pq.forEach((x)->System.out.println(x));


    }
}
