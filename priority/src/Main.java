import java.util.PriorityQueue;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Ticket> priorityQueue = new PriorityQueue<>(new TicketComparator());
        priorityQueue.add(new Ticket(50, true));
        priorityQueue.add(new Ticket(20, true));
        priorityQueue.add(new Ticket(30, false));
        priorityQueue.add(new Ticket(10, true));
        priorityQueue.add(new Ticket(100, false));
        priorityQueue.add(new Ticket(80, true));

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll().getCost());
        }

        System.out.println("------------------------");
        Comparator<Ticket> comparator = new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                if (o1.isVIP() == true && o2.isVIP() == false) {
                    return 1;
                } else if (o1.isVIP() == false && o2.isVIP() == true) {
                    return -1;
                }
                return 0;
            }
        };
        PriorityQueue<Ticket> priorityQueue2 = new PriorityQueue<>(comparator);
        priorityQueue2.add(new Ticket(50, true));
        priorityQueue2.add(new Ticket(20, true));
        priorityQueue2.add(new Ticket(30, false));
        priorityQueue2.add(new Ticket(10, true));
        priorityQueue2.add(new Ticket(100, false));
        priorityQueue2.add(new Ticket(80, true));
        while (!priorityQueue2.isEmpty()) {
            System.out.println(priorityQueue2.poll().isVIP());
        }
    }
}
