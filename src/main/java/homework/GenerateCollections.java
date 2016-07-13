package homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class GenerateCollections {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection = generate(collection, () -> "name");

        collection.forEach(System.out::println);
    }

    private static Collection<String> generate(Collection<String> collection, Supplier<String> supplier) {

        collection.add(supplier.get());

        return collection;

    }
}
