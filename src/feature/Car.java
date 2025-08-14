package feature;

public class Car {
    // Atributos
    public String color;
    public String marca;
    public String modelo;

    // Constructor por defecto
    public Car() {}

    public Car(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerate() {
        System.out.println("Acelerando" + color);
    }

    public int calculoKilometraje() {
        System.out.println("Acelerando");
        return 4;
    }

    public void stop() {
        System.out.println("Stop");
    }
}
