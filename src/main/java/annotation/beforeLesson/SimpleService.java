package annotation.beforeLesson;

/**
 * Created by james on 16.07.16.
 * This class for ...
 */
@Service(name = "Super simple",lazyLoad = true)
public class SimpleService {

    @Init
    public void initService() {
        System.out.println("Init Service");
    }

    @Init(suppressExeption = true)
    public void generate() {
        System.out.println("generate");
    }
}
