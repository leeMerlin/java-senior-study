package list;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(151,"龙族IV",33.5));
        list.add(new Book(1,"天火大道",150.0));
        list.add(new Book(26,"江南",66.6));
        list.add(new Book(820,"盗墓人",65.0));
        System.out.println(list);

        list.add(2,new Book(3,"追风筝的人",99.3));
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(2,new Book(9,"岛",10.5));
        System.out.println(list);
        System.out.println(list.get(1));

        list.add(new Book(1,"作文大全",114.0));
        System.out.println(list);
        System.out.println(list.indexOf(new Book(1,"作文大全",15.0)));
        System.out.println(list.lastIndexOf(new Book(1,"作文大全",64.0)));
    }
}
