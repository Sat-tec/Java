import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(369);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(10));

        list.remove(0);

        list.remove(Integer.valueof(10));
        System.out.println(list);

    }
}
