import java.util.Arrays;

public class ObjectClone implements Cloneable{

    int a;
    String s;

    ObjectClone(int a, String s){
        this.a = a;
        this.s = s;
    }
                                        // Метод clone() помогает нам быстро клонировать различные объекты
    public String toString(){           // вместо того, чтобы писать длинные коды
        return "int: " + a + " String: " + s;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int[] arr_clone = arr.clone();
        System.out.println(Arrays.toString(arr_clone));

        try {
            ObjectClone first = new ObjectClone(12, "Original");
            ObjectClone copy = (ObjectClone)first.clone();
            System.out.println(first.toString());
            System.out.println(copy.toString());
        } catch(CloneNotSupportedException c){}
    }
}
