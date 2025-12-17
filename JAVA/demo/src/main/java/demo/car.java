package demo;

public class car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    car() {
        tyres = 4;
        doors = 4;
    }

    void displayCharateristics() {
        System.out.println("Color : " + color);
        System.out.println("Transmission : " + transmission);
        System.out.println("Make : " + make);
        System.out.println("Tyres : " + tyres);
        System.out.println("Doors : " + doors);
    }

    void accelarator() {
        System.out.println("Car is moving forward.");
    }

    void brake() {
        System.out.println("Car has stopped.");
    }
}
