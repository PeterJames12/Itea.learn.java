package reflection;

import lombok.Getter;

/**
 * author Igor
 */
@Getter
public class Teacher extends Director {

    private String name = "Karga";
    private int age = 22;

    @Deprecated
    private String go() {

        return "Run";
    }


    private int mas[] = {5, 4, 54,};

}
