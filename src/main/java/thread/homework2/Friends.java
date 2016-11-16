package thread.homework2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * author Igor
 */
public class Friends {

    private static List<Integer> season = new LinkedList<>();
    private static List<Integer> episode = new LinkedList<>();

    public static void main(String[] args) {

        Random randomSeason = new Random();
        int sezz = randomSeason.nextInt(10);
        int epp = randomSeason.nextInt(24);

        selectSeason(sezz);
        selectEpisode(epp);

    }

    private static void selectSeason(int sezz) {

        IntStream.rangeClosed(1, 12).forEach(season::add);
        System.out.println("Season: " + season.get(sezz));
    }

    private static void selectEpisode(int epp) {
        IntStream.rangeClosed(1, 24).forEach(episode::add);
        System.out.println("episode: " + episode.get(epp));
    }
}
