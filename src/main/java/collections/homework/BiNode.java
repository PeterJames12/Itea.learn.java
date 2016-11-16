package collections.homework;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * author Igor
 */
@Getter
@AllArgsConstructor
public class BiNode<L, R> {

    private L left;
    private R right;
    private BiNode<L, R> next;

    public BiNode(L left, R right) {
        this.left = left;
        this.right = right;
    }
}
