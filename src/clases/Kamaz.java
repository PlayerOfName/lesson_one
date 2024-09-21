package clases;

import interfaces.CarryWeight;

public class Kamaz extends Car implements CarryWeight {

    public static final String NAME_MODEL = Kamaz.class.getSimpleName();
    public static final short MAX_SPEED = 180;

    private Cargo cargo;

    public Kamaz(String color, int speed, Cargo cargo) {
        super(color, speed);
        this.cargo = cargo;
    }

    public Kamaz() {}

    @Override
    public void infoCar() {
        System.out.println("Truck");
        super.infoCar();
        System.out.println("Cargo name: " + cargo.getName());
        System.out.println("Cargo weight: " + cargo.getWeight());
    }

    @Override
    public void speedUp() {
        if ((getSpeed() + 10) <= MAX_SPEED) {
            setSpeed(getSpeed() + 10);
        }else{
            System.out.println("The car cannot exceed the maximum speed!");
        }
    }

    @Override
    public void carryWeight() {
        System.out.println("I transport cargo");
    }

    @Override
    public void loadingKamaz() throws InterruptedException {
        System.out.println("loading process, please wait...");
        for (int i = 0; i <= 100; i++) {
            System.out.println(i + "%");
            Thread.sleep(500);
        }
        System.out.println("loading successful");
    }

    public static void printNameModel() {
        System.out.println(NAME_MODEL);
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
