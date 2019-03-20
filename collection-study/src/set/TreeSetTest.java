package set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(-5);
        set.add(-7);
        set.add(10);
        set.add(6);
        set.add(3);
        //创建Iterator迭代器对象
        Iterator<Integer> it = set.iterator();
        System.out.println("Set集合中的元素");
        //遍历并输出Set集合中的元素
        while (it.hasNext()){
            System.out.println(it.next() + " ");
        }

    }
}
