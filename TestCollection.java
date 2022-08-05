import java.util.*;

public class TestCollection {
    public static void main(String[] args) {
//        OuterClass outerObj = new OuterClass();
//        outerObj.enterName();
        Student student1 = new Student(){{
            setFullName("mershad");
            setId(1);
        }};
        Student student2 = new Student(){{
            setId(2);
            setFullName("mehran");
        }};
        Student student3 = new Student(){{
            setId(3);
            setFullName("mehrnaz");
        }};

        TreeSet<Integer> treeSet = new TreeSet<>();
        TreeSet<Student> treeSet1 = new TreeSet<>();
        Map<Integer , Student> map = new HashMap<>();
        map.put(1 , student1);
        map.put(2 , student2);
        map.put(3 , student3);
//        treeSet.add(10);
//        treeSet.add(6);
//        treeSet.add(40);
//        treeSet.add(32);
//        System.out.println(treeSet.subSet(1 , 50));
        treeSet1.add(student1);
        treeSet1.add(student2);
        treeSet1.add(student3);
//        System.out.println(treeSet1);
        Iterator<Map.Entry<Integer , Student>> entryIterator = map.entrySet().iterator();
//        System.out.println(entryIterator);
        System.out.println(entryIterator);
    }
}
