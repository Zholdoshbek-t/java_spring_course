import java.util.Comparator;

public class ScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.SAT_SCORE > o2.SAT_SCORE) {
            return -1;
        } else if (o1.SAT_SCORE < o2.SAT_SCORE) {
            return 1;
        }
        return 0;
    }
}
