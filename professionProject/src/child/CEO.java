package child;
import parent.Employee;
import parent.Rang;

public class CEO extends Employee {
    private boolean hasCompanyCar;

    public CEO(String fio, int age, int salary, boolean hasCompanyCar, Rang rang){
        super(fio, age, salary, rang);
        this.hasCompanyCar = hasCompanyCar;
    }
    public CEO(){

    }

    public void goPublic(){
        System.out.println("We are searching for a good credit bank!");
        System.out.println("In return, we are offering a great opportunity to become rich!");
    }

    @Override
    public void print(){
        if(hasCompanyCar==true){
            System.out.println("Has a company car");
        } else{
            System.out.println("Doesn't have a company car");
        }
        System.out.println("Position: child.CEO.");
        System.out.println();
    }

    @Override
    public void goToVacation() {
        System.out.println("I am going to Maldives!");
    }

    @Override
    public void goToDayOff() {
        System.out.println("The main role of our company gets child.CEO.");
        System.out.println("So, it's better for use to let me to have a rest.");
    }
}
