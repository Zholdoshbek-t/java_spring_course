import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> seconds = new ArrayList<>();
        seconds.add(60);
        seconds.add(3600);
        seconds.add(3600 * 24);
        seconds.add(3600 * 24 * 7);
        seconds.add(3600 * 24 * 30);
        seconds.forEach(System.out::println);
        System.out.println("---------------");
        Collections.sort(seconds);
        seconds.forEach(System.out::println);
        System.out.println("---------------");
        int index_of_hour = Collections.binarySearch(seconds, 3600);
        System.out.println("The index of seconds in one hour is " + index_of_hour);
        Collections.reverse(seconds);
        seconds.forEach(System.out::println);
        System.out.println("---------------");
        Collections.shuffle(seconds);
        seconds.forEach(System.out::println);
        int index_of_max = seconds.indexOf(Collections.max(seconds));
        int index_of_min = seconds.indexOf(Collections.min(seconds));
        int max_num = Collections.max(seconds);
        int min_num = Collections.min(seconds);
        System.out.printf("The max number is on the %d position and is equal to %d%n", index_of_max, max_num);
        System.out.printf("The min number is on the %d position and is equal to %d%n", index_of_min, min_num);
    }
}
