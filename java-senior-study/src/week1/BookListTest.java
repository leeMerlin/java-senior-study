package week1;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookListTest {
    public static void main(String[] args) {
        List<BookList> bookList = new ArrayList<>();
        bookList.add(new BookList("java", 66.6));
        bookList.add(new BookList("HTML", 33.3));
        bookList.add(new BookList("高数",22.2));
        System.out.println("---图书信息---");
        System.out.println("书名     价格");
        for (int i = 0 ,len = bookList.size();i <len; i++){
            System.out.println(bookList.get(i).getName() + "      "+ bookList.get(i).getPrice());
            System.out.println();
        }
        System.out.println("用Iterator迭代器输出结果");
        Iterator<BookList> iterator = bookList.iterator();
        while (iterator.hasNext()) {
            BookList book = iterator.next();
            System.out.println(book.getName() + "   " + book.getPrice());
        }
        System.out.println("Lambda表达式遍历输出结果");
        bookList.forEach(bookList1 -> System.out.println(bookList1.getName() + "  "+ bookList1.getPrice()));
    }
}
