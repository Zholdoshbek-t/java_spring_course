public abstract class Employee {
    private String fio;
    private int age;
    private int salary;

    public Employee(String fio, int age, int salary){
        this.fio = fio;
        this.age = age;
        this.salary = salary;
    }

    public Employee(){

    }

    public abstract void print();

    public abstract void goToVacation();

    public abstract void goToDayOff();

}
