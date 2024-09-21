package clases;

import interfaces.InstallBodyKit;

public class BugattiChiron extends Car implements InstallBodyKit {

    public static final String NAME_MODEL = BugattiChiron.class.getSimpleName();
    public static final int MAX_SPEED = 490;
    private boolean spoiler = false;

    private int maneuverability;

    public BugattiChiron() {}
    public BugattiChiron(String color, int speed, int maneuverability) {
        super(color, speed);
        this.maneuverability = maneuverability;
    }

    @Override
    public void installSpoiler() {
        if (!spoiler) {
            maneuverability = maneuverability + 15;
            spoiler = true;
            System.out.println("Great, you've installed a spoiler!");
        }else {
            System.out.println("You have a spoiler");
        }
    }

    @Override
    public void activateNitro() throws InterruptedException {
        System.out.println("You have activated nitro!");
        setSpeed(getSpeed() + 50);
        Thread.sleep(10000); // 10 sec
        System.out.println("Nitro is out!");
        setSpeed(getSpeed() - 50);
    }

    @Override
    public void infoCar() {
        System.out.println("Sport car");
        super.infoCar();
        System.out.println("Maneuverability: " + maneuverability);
    }

    @Override
    public void speedUp() {
        if ((getSpeed() + 10) <= MAX_SPEED) {
            setSpeed(getSpeed() + 10);
        }else{
            System.out.println("The car cannot exceed the maximum speed!");
        }
    }

    public static void printNameModel() {
        System.out.println(NAME_MODEL);
    }

    public int getManeuverability() {
        return maneuverability;
    }

    public void setManeuverability(int maneuverability) {
        this.maneuverability = maneuverability;
    }

    public boolean isSpoiler() {
        return spoiler;
    }

    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }
}
