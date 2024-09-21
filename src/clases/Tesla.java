package clases;

import interfaces.Electric;

public class Tesla extends Car implements Electric {

    public static final String NAME_MODEL = Tesla.class.getSimpleName();
    public static final int MAX_SPEED = 230;

    @Override
    public void speedUp() {
        if ((getSpeed() + 10) <= MAX_SPEED) {
            setSpeed(getSpeed() + 10);
        }else{
            System.out.println("The car cannot exceed the maximum speed!");
        }
    }

    private int battery; // Measured in %

    public Tesla(String color, int speed, int battery) {
        super(color, speed);
        this.battery = battery;
    }

    public Tesla() {}
    @Override
    public void infoCar() {
        System.out.println("Electric Car");
        super.infoCar();
        System.out.println("Battery charge: " + battery + "%");
    }

    @Override
    public void chargingBattery() throws InterruptedException {
        for (int i = getBattery(); i <= 100; i++) {
            System.out.println("The battery is charging... " + i + "%");
            setBattery(i);
            Thread.sleep(1000);
        }
        System.out.println("The battery is fully charged");
    }

    public static void printNameModel() {
        System.out.println(NAME_MODEL);
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
