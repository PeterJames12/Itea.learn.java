package thread.homework2;

import lombok.SneakyThrows;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * author Igor
 */
public class GoodLectures {

    private static final String path = "/home/james/workspace/Itea/src/main/java/thread/homework2/words.txt";

    @SneakyThrows
    public static void main(String[] args) {

        File file = new File(path);

        writer(file);

        String[] mas = reader();

        System.out.println("mas: " + Arrays.toString(mas));

    }

    @SneakyThrows
    private static void writer(File file) {

        try (PrintWriter result = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
            result.println("java");
            result.println("javac");
        }
    }

    @SneakyThrows
    private static String[] reader() {

        List<String> collect = Files.lines(Paths.get(path))
                .collect(Collectors.toList());

        String mas[] = new String[collect.size()];
        collect.toArray(mas);

        return mas;
    }
}