public class Mi8 extends Helicopter implements VerticalTakeOff{
    @Override
    public void fly() {
        System.out.println("Helicpoter Mi8");
    }

    @Override
    public void verticalTakeOff() {
        System.out.println("Mi8 vertical taking off");
    }
}
