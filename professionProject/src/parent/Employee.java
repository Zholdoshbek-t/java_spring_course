package parent;

public abstract class Employee {
    private String fio;
    private int age;
    private int salary;
    private Rang rang;

    public Employee(String fio, int age, int salary, Rang rang){
        this.fio = fio;
        this.age = age;
        this.salary = salary;
        this.rang = rang;
    }

    public Employee(){

    }

    public abstract void print();

    public abstract void goToVacation();

    public abstract void goToDayOff();

    public Rang getRang(){
        return rang;
    }

}
