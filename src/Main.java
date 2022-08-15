import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> integers = new TreeSet<>();
        List<String> strings = new ArrayList<>();
        integers.add("january");
        integers.add("febryary");
        integers.add("march");
        integers.add("april");
        integers.add("may");
        integers.add("june");
        integers.add("jule");
        integers.add("august");
        integers.add("september");
        integers.add("october");
        integers.add("november");
        integers.add("december");
        System.out.println(integers);

        System.out.println(integers.contains("march"));

        integers.remove("november");
        System.out.println(integers);

        integers.add("december");

        strings.add(integers.first());
        strings.add(integers.last());
        System.out.println(strings);
    }
}
