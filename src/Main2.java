import java.util.Iterator;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet1.add("a");
        treeSet1.add("b");
        treeSet1.add("c");
        treeSet1.add("d");
        treeSet1.add("e");

        treeSet2.add("a");
        treeSet2.add("c");
        treeSet2.add("d");
        treeSet2.add("f");
        treeSet2.add("g");

        Iterator<String> iterator2 = treeSet1.iterator();
        while (iterator2.hasNext()) {
            String element = iterator2.next();
            treeSet2.remove(element);
            }

        Iterator<String> iterator = treeSet2.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            treeSet1.add(element);
        }

        System.out.println(treeSet1);
        System.out.println(treeSet2);

    }
}
