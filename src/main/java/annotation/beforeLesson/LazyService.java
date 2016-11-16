package annotation.beforeLesson;

/**
 * Created by james on 16.07.16.
 * This class for ...
 */
@Service(name = "Syper lazy")
public class LazyService {

    @Init
    public void lazyInit() throws Exception {
        System.out.println("Lazy Service");
    }
}
