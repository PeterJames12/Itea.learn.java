package reflection;

import lombok.Getter;

/**
 * author Igor
 */

public class Flair {

    private String name = "Alex";

    private int age = 99;

    private String printMe() {

        return "I'm private method";
    }

    @Getter
    private int mas[] = {1, 1, 1};

}
