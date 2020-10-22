import child.CEO;
import child.Developer;
import child.Manager;
import child.Specialist;
import parent.Employee;
import parent.Rang;

public class Main {

    public static void printDeveloperGrade(Employee employee){
        switch(employee.getRang()) {
            case JUNIOR:
                System.out.println("I'm a junior developer");
                break;
            case MIDDLE:
                System.out.println("I'm a middle developer");
                break;
            case SENIOR:
                System.out.println("I'm a senior developer");
                break;
            case TEAMLEAD:
                System.out.println("I'm a teamlead developer");
                break;
            default:
                break;
        }

    }

    public static void main(String[] args){

        Employee[] employees = {new Developer("Sanjar",19,190000,Rang.SENIOR),
                                new Developer("Samat",18,7000000,Rang.JUNIOR),
                                new Developer("Shabdan",18,520000,Rang.MIDDLE),
                                new Developer("Tilek",19,3000000,Rang.TEAMLEAD)};

        for(Employee employee: employees) {
            employee.getRang().printPhrase();
        }

    }
}
