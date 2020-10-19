public class Main {
    public static void main(String[] args){
        Specialist football = new Specialist("Leo Messi",27,2200000,99);
        Specialist marketing = new Specialist("Steve Jobs",25,111000,99);
        Specialist painting = new Specialist("Leonardo Da Vinci",33,21233121,99);
        football.goToDayOff();
        marketing.goToDayOff();
        painting.goToDayOff();

        Developer game = new Developer("Misha Chun",22,3000,"Junior");
        Developer projectManage = new Developer("Mia Komrero",28,13000,"Senior");
        Developer hacker = new Developer("Edward Snowden",18,40000,"Supreme");
        Developer website = new Developer("Misha Chun",22,3000,"Junior");
        game.goToDayOff();
        projectManage.goToDayOff();
        hacker.goToDayOff();
        website.goToDayOff();

        Manager investor = new Manager("Warren Buffet",43,300000,true);
        Manager wolf = new Manager("Jordan Belfort",52,600000,true);
        investor.goToDayOff();
        wolf.goToDayOff();

        CEO walmart = new CEO("Sam Walton",35,4000000,true);
        walmart.goToDayOff();



    }
}
