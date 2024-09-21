package clases;

public abstract class Car {

    private String color;
    private int speed;

    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void infoCar(){
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }

    public abstract void speedUp();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car(){}
}
