import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(0);

        System.out.println(symmetricDifference(set1, set2));
//        System.out.println(set2);
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        HashSet symmetricDiff = new HashSet<>(set1);
        HashSet intersect = new HashSet<>(set1);
        symmetricDiff.addAll(set2);
        intersect.retainAll(set2);
        symmetricDiff.removeAll(intersect);
        return symmetricDiff;
    }
}
