
package CollectionFramework.ArrayDeque;
import java.util.*;

public class SampleProgram1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();

        ad.offerFirst(10);
        ad.offerFirst(20);
        ad.offerFirst(30);
        ad.offerFirst(40);

        ad.forEach((x)-> System.out.println(x));

    }
}
