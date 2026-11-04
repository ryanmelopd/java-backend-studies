package genericssetmap1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // 3. max, sum e fillWithZeros
        List<Integer> ints = List.of(3, 9, 4, 1, 5);
        List<String> strings = List.of("Maria", "Zebra", "Alex");
        System.out.println("Maior inteiro: " + Utils.max(ints));
        System.out.println("Maior string: " + Utils.max(strings));

        List<Integer> intsToSum = List.of(1, 2, 3, 4, 5);
        List<Double> doublesToSum = List.of(2.5, 3.0, 2.0);
        System.out.println("Soma inteiros: " + Utils.sum(intsToSum));
        System.out.println("Soma doubles: " + Utils.sum(doublesToSum));

        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        Utils.fillWithZeros(numbers, 3);
        Utils.fillWithZeros(objects, 2);
        System.out.println("Numbers: " + numbers);
        System.out.println("Objects: " + objects);

        Pair<String, Integer> pair = new Pair<>("Idade", 25);
        System.out.println("Pair: " + pair);

        // 4. Set com equals/hashCode
        Set<Student> students = new HashSet<>();
        students.add(new Student(1, "Maria"));
        students.add(new Student(2, "Alex"));
        students.add(new Student(1, "Maria Souza")); // mesmo id do primeiro
        System.out.println("Tamanho do set: " + students.size());

        // 5. Map: contagem de palavras
        String text = "java é java e spring é spring e java";
        Map<String, Integer> count = new HashMap<>();
        for (String word : text.split(" ")) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> e : count.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}