package child;
import parent.Employee;
import parent.Rang;

public class Manager extends Employee {
    private boolean hasStocks;

    public Manager(String fio, int age, int salary, boolean hasStocks, Rang rang){
        super(fio, age, salary, rang);
        this.hasStocks = hasStocks;
    }
    public Manager(){

    }

    public void writeProcedures(){
        System.out.println("First of all, write a plan for a month.");
        System.out.println("Secondly, try to find weak spots.");
        System.out.println("Finally, solve them.");
    }

    @Override
    public void print(){
        if(hasStocks==true){
            System.out.println("Has company stocks");
        } else{
            System.out.println("Doesn't have company stocks");
        }
        System.out.println("Position: manager.");
        System.out.println();
    }

    @Override
    public void goToVacation() {
        System.out.println("I am going to Hawaii!");
    }

    @Override
    public void goToDayOff() {
        System.out.println("I have to look for my childrens.");
        System.out.println("My wife comes on the next week.");
    }
}
