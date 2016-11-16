package collection2.workItea;

import java.util.*;
import java.util.stream.IntStream;

/**
 * author Igor
 */
public class Cooll {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        IntStream.rangeClosed(0, 10).boxed().forEach(queue::add);
/*

        while (queue.peek() != null) {
            System.out.println(queue.poll());
        }
*/
        Deque<Integer> deque = new LinkedList<>();
        IntStream.rangeClosed(0, 12).boxed().forEach(deque::add);

//        int buff = 0;
        /*while (deque.peek() != null) {
            System.out.println(deque.poll());
            buff += deque.getFirst() + deque.getLast();
        }
        */

        Integer last = deque.getLast();
        Integer first = deque.getFirst();
        int buff = 0;

    /*    while (deque.poll() != null) {
            buff = first + last;
            first--;
            last--;
            System.out.println(buff);
        }*/

  /*      while (deque.peekFirst() != null && deque.peekLast() != null &&
                deque.peekFirst() != deque.peekLast()) {

            System.out.println(deque.pollFirst() + deque.pollLast());
        }

        Deque<Integer> deq = new LinkedList<>();
        IntStream.range(0, 19).boxed().forEach(deq::add);

        while (deq.peekFirst() != null && deq.peekLast() != null
                && deq.peekFirst() != deq.peekLast()) {
            System.out.println(deq.pollFirst() + deq.pollLast());
        }
*/

    }
}
