package structural.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author xiao
 * @date 2020/4/4 17:28
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        iterator.forEachRemaining(System.out::println);
    }
}
