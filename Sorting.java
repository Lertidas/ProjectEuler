import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public static List<String> mergeSort(List<String> arrayList) {
        if (arrayList.size() < 2) {
            return arrayList;
        }
        List<String> a1 = arrayList.subList(0, arrayList.size()/2);
        List<String> a2 = arrayList.subList(arrayList.size()/2 + 1, arrayList.size());

        a1 = mergeSort(a1);
        a2 = mergeSort(a2);

        return merge(a1, a2);
    }
    // Helper function for merge
    private static List<String> merge(List<String> a, List<String> b) {
        List<String> c = new ArrayList<>();

        while (a.size() > 0 && b.size() > 0) {
            if (a.get(0).compareTo(b.get(0)) > 0) {
                c.add(b.get(0));
                b.remove(0);
            }
            else {
                c.add(a.get(0));
                a.remove(0);
            }
        }

        // One of lists is empty
        while (a.size() > 0) {
            c.add(a.get(0));
            a.remove(0);
        }
        while (b.size() > 0) {
            c.add(b.get(0));
            b.remove(0);
        }

        return c;
    }
}
