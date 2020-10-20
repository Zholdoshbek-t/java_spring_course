package child;
import parent.Employee;
import parent.Rang;

public class Specialist extends Employee {
    private int level;

    public Specialist(String fio, int age, int salary, int level, Rang rang){
        super(fio,age,salary, rang);
        this.level = level;
    }
    public Specialist(){

    }

    public void workWithClients(){
        System.out.println("I'm sorry, but today we don't work.");
        System.out.println("Please, try to call tomorrow.");
    }

    @Override
    public void print(){
        System.out.println("Level: " + level);
        System.out.println("Position: specialist.");
        System.out.println();
    }

    @Override
    public void goToVacation() {
        System.out.println("I am going to Bali!");
    }

    @Override
    public void goToDayOff() {
        System.out.println("I worked every day from 7 a.m. to 9 p.m.");
        System.out.println("I've deserved to get a rest.");
    }
}
