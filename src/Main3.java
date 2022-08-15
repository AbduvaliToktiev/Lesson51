import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();
        for (int i = 1; i <= 1000; i++) {
            integers.add(i);
        }

        Set<Integer> subSet1 = integers.subSet(5, 701);
        Set<Integer> subSet2 = integers.headSet(30);
        Set<Integer> subSet3 = integers.tailSet(980);

        Integer sum1 = subSet1.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum1);

        Integer sum2 = subSet2.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum2);

        Integer sum3 = subSet3.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum3);
    }
}
