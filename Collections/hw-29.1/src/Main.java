import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> books = new LinkedList<String>();
        // An API that isn't comprehensible isn't usable.
        books.add("Harry Potter");
        books.add("The perfect look");
        books.add("Lust for Life");
        books.add("Lui, Artur and Adel");
        books.add("Sherlock Holmes");
        books.forEach(System.out::println);
        System.out.println("--------");
        books.offerFirst("Djamilya");
        books.offerFirst("Djamilya");
        books.offer("Friends");
        books.offer("Friends");
        books.forEach(System.out::println);
        System.out.println("--------");
        books.removeFirst();
        books.removeLast();
        books.forEach(System.out::println);
    }
}
