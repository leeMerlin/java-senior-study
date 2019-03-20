package soft1841.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("李云龙", 45));
        list.add(new Student("楚云飞",40 ));
        list.add(new Student("和尚", 35));
        list.add(new Student("秀芹", 30));
        Collections.sort(list);
        for (Student student : list) {
            System.out.println("姓名:" + student.getName() + ",年龄：" + student.getAge());
        }
    }
}
