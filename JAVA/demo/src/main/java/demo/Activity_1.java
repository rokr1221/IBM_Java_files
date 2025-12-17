package demo;

public class Activity_1 {
    public static void main(String[] args) {
        car obj = new car();
        obj.make = 2014;
        obj.color = "Black";
        obj.transmission = "Manual";

        obj.accelarator();
        obj.brake();
        obj.displayCharateristics();

    }
}
