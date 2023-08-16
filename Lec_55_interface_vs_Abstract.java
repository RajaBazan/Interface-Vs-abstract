package hello.com;
interface Bicycle {
    int a = 45;
    void applyBrake(int decrement);
    void applySpeed(int increment);
}
interface HornBicycle{
    void applyHorn();
    void BlowHorn();
}
class Avoncycle implements Bicycle, HornBicycle{
    @Override
    public void applyBrake(int decrement) {
        System.out.println("Bicycle stops");
    }

    @Override
    public void applySpeed(int increment) {
        System.out.println("Speed up Bicycle");
    }

    @Override
    public void applyHorn() {
        System.out.println("Kabi kushi kabi ghum");
    }

    @Override
    public void BlowHorn() {
        System.out.println("POO");
    }
}
public class Lec_55_interface_vs_Abstract {
    public static void main(String[] args) {
    Avoncycle cycle = new Avoncycle();
    cycle.applyBrake(10);
    cycle.applySpeed(12);
    cycle.applyHorn();
    cycle.BlowHorn();
        System.out.println(cycle.a);
    }
}
