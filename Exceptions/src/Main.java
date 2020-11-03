import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(3);
        arrlist.add(-6);
        arrlist.add(11);
        arrlist.add(-5);
        arrlist.add(22);
        int h = 11;
        for (Integer a : arrlist) {
            try {
                System.out.println(negValueExc(a));
            } catch (NegativeException e) {
                System.out.println("Inappropriate value of radius: " + a + " with the height: " + h);
            }
        }
    }

    public static int negValueExc(int r) throws NegativeException {
        if (r < 1) {
            throw new NegativeException();
        }
        return r * r * 11 * 3;
    }
}