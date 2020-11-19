import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o2 > o1) {
                    return 1;
                }
                return 0;
            }
        };

        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(9);
        treeSet.add(11);
        treeSet.add(17);
        treeSet.add(23);
        treeSet.add(34);
        System.out.println(treeSet);
        System.out.println(treeSet.ceiling(4));
        System.out.println(treeSet.floor(4));
        System.out.println(treeSet.headSet(11,true));
        System.out.println(treeSet.tailSet(11,false));
        System.out.println("---------------");
        TreeSet<String> set = new TreeSet<>();
        set.add("Lexus");
        set.add("Mercedes");
        set.add("Ferrari");
        set.add("Aston Martin");
        set.add("Lamborghini");
        set.add("Bugatti");
        System.out.println(set.descendingSet());

        System.out.println("---------------");
        Student azat = new Student("Azat", 20, 1430);
        Student dastan = new Student("Dastan", 19, 1530);
        Student begi = new Student("Begimai", 19, 1480);
        Student alex = new Student("Alex", 19, 1590);
        Set<Student> studentTreeSet = new TreeSet<>(new ScoreComparator());
        studentTreeSet.add(azat);
        studentTreeSet.add(dastan);
        studentTreeSet.add(begi);
        studentTreeSet.add(alex);
        for(Student s: studentTreeSet){
            System.out.println(s.name + " " + s.SAT_SCORE);
        }
    }
}
