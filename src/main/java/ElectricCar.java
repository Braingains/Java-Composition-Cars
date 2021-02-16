public class ElectricCar extends Car {


    private Motor motor;
    private Tyres tyres;

    public ElectricCar (String name, double price, String colour, Motor motor, Tyres tyres) {
        super(name, price, colour, tyres);
        this.motor = motor;
    }

    public Motor getMotor() {
        return this.motor;
    }

}
