package thread.homework2;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * author Igor
 */
public class Team {

    private static List<String> halfTeam = new LinkedList<>();
    private static List<String> fullTeam = new LinkedList<>();
    private static Random random = new Random();


    @SneakyThrows
    public static void main(String[] args) {
        String path = "/home/james/workspace/Itea/src/main/java/thread/homework2/namesOurTeam";


        List<String> collect = Files.lines(Paths.get("/home/james/workspace/Itea/src/main/java/thread/homework2/namesOurTeam")).collect(Collectors.toList());


        collectTeam(collect);








        /*File file = new File(path);

        BufferedReader paper = new BufferedReader(new FileReader(file));

        String line;

        while ((line = paper.readLine()) != null) {
            System.out.println(line);
        }
        */
    }

    private static void collectTeam(List<String> collect) {

        int index = random.nextInt(collect.size());

        System.out.println(collect.get(index));

    }
}
