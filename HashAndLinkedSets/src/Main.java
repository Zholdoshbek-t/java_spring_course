import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(6);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(4);

        for(Integer i: hashSet){
            System.out.println(i);
        }

        System.out.println("Does hashSet contain 3? " + hashSet.contains(3));
        System.out.println("Does hashSet contain 9? " + hashSet.contains(9));

        System.out.println("-----------------");

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(6);
        linkedHashSet.add(2);
        linkedHashSet.add(2);
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(3);
        linkedHashSet.add(5);

        Iterator<Integer> iterator = linkedHashSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Can we remove 5 from linkedHashSet? " + linkedHashSet.remove(5));
    }
}
