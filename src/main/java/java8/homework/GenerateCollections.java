package java8.homework;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class GenerateCollections {

    public static void main(String[] args) {

        File file = new File("/home/james/workspace/Itea/src/main/java/java8.homework/someText.txt");

        Collection<String> collection = new ArrayList<>();

        selectText(collection,file);
        collection.forEach(System.out::println);
    }

    private static void selectText(Collection<String> collection, File file) {
        try {
            StreamTokenizer tokenizer = new StreamTokenizer(new BufferedReader(new FileReader(file)));
            while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                if (tokenizer.ttype == StreamTokenizer.TT_WORD) {
                    collection = generate(collection, () -> tokenizer.sval);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Collection<String> generate(Collection<String> collection, Supplier<String> supplier) {

        collection.add(supplier.get());
        return collection;
    }
}
