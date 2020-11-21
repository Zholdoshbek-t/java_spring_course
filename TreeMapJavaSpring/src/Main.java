import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        TreeMap<String, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.put("Tilek", 100000);
        treeMap.put("Beks", 90000);
        treeMap.put("Adi", 80000);
        treeMap.put("Bika", 120000);
        treeMap.put("Jasya", 100000);
        System.out.println(treeMap);
        TreeMap<String, Integer> treeMap1 = (TreeMap<String, Integer>) treeMap.clone();
        System.out.println(treeMap1.descendingMap());
//        Set<Map.Entry<String,Integer>> entrySet = treeMap.entrySet();
//        for(Map.Entry<String,Integer> i: entrySet){
//            System.out.println(i.getKey());
//            System.out.println(i.getValue());
//        }
        System.out.println("------------");
        Comparator comparator = treeMap.comparator();
        System.out.println(comparator);
    }
}
