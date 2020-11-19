import java.util.Comparator;

public class Student {
    String name;
    int age;
    int SAT_SCORE;

    public Student() {

    }

    public Student(String name, int age, int SAT_SCORE) {
        this.name = name;
        this.age = age;
        this.SAT_SCORE = SAT_SCORE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSAT_SCORE() {
        return SAT_SCORE;
    }

    public void setSAT_SCORE(int SAT_SCORE) {
        this.SAT_SCORE = SAT_SCORE;
    }

}
