import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>(5);
        books.add("Harry Potter");
        books.add("The perfect look");
        books.add("Lust for Life");
        books.add("Lui, Artur and Adel");
        books.add("Sherlock Holmes");
        books.forEach(System.out::println);
        System.out.println("------------------");
        books.remove(books.size()-1);
        for(String s: books){
            System.out.println(s);
        }
        System.out.println("------------------");
        books.set(3, "Sherlock Holmes");
        books.forEach(x-> System.out.println(x));
        System.out.println("------------------");
        System.out.println(books.get(books.size()-1));
        books.clear();
        books.add("-");
        books.add("-");
        books.add("-");
    }
}
