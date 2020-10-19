package child;
import parent.Employee;

public class Developer extends Employee {
    private String rang;

    public Developer(String fio, int age, int salary, String rang){
        super(fio,age,salary);
        this.rang = rang;
    }
    public Developer(){

    }

    public void writeCode(){
        System.out.println("2020 is equal to 11111100100 in binary!");
    }

    @Override
    public void print(){
        System.out.println("Rang: " + rang);
        System.out.println("Position: developer.");
        System.out.println();
    }

    @Override
    public void goToVacation() {
        System.out.println("I am going to New York!");
    }

    @Override
    public void goToDayOff() {
        System.out.println("My office became my house.");
        System.out.println("I definitely need to go somewhere where I can forget everything.");
    }
}
