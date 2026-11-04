package genericssetmap1;

import java.util.List;

public class Utils {
    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser vazia");
        }
        T biggest = list.get(0);
        for (T item : list) {
            if (item.compareTo(biggest) > 0) {
                biggest = item;
            }
        }
        return biggest;
    }

    public static double sum(List<? extends Number> list) {
        double total = 0.0;
        for (Number n : list) {
            total += n.doubleValue();
        }
        return total;
    }

    public static void fillWithZeros(List<? super Integer> list, int quantity) {
        for (int i = 0; i < quantity; i++) {
            list.add(0);
        }
    }
}