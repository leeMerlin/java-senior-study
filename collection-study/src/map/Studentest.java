package map;

import java.util.*;

public class Studentest {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        list1.add(new Student(1, "菜虚坤"));
        list1.add(new Student(3, "鹿晗"));
        list2.add(new Student(2, "谢广坤"));
        list2.add(new Student(4, "谢大脚"));
        Map<String, List<Student>> map = new HashMap<>();
        map.put("男生", list2);
        map.put("女生", list1);
        //通过Iterator遍历Map集合
        Iterator<Map.Entry<String, List<Student>>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, List<Student>> entry = iterator.next();
            System.out.println(entry.getKey());
            Iterator<Student> listIterator = entry.getValue().iterator();
            while (listIterator.hasNext()) {
                System.out.println(listIterator.next());
            }
        }
    }
}
