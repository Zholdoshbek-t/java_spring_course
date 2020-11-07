import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Stack<String> autos = new Stack<String>();

        autos.push("BMW");
        autos.push("Toyota");
        autos.push("Mercedes");
        autos.push("Audi");
        autos.push("Ferrari");

        for(String auto: autos){
            System.out.println(auto);
        }

        System.out.println("----------------");

        autos.pop();
        System.out.println(autos.peek());
        System.out.println(autos.search("BMW"));
    }
}
