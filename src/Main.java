import clases.Cargo;
import clases.Tesla;
import clases.BugattiChiron;
import clases.Kamaz;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Tesla tesla = new Tesla("Grey", 70, 32);
        BugattiChiron bugattiChiron = new BugattiChiron("Black", 100, 70);
        Cargo cargo = new Cargo("Sand", 2000);
        Kamaz kamaz = new Kamaz("Blue", 50, cargo);

    }
}