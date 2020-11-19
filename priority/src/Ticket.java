public class Ticket {
    int cost;
    boolean VIP;

    public Ticket(){

    }

    public Ticket(int cost, boolean VIP){
        this.cost = cost;
        this.VIP = VIP;
    }

    public int getCost() {
        return cost;
    }

    public boolean isVIP() {
        return VIP;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

}
