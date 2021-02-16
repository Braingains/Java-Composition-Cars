public class ElectricCar extends Car {


    private Motor motor;

    public ElectricCar (String name, double price, String colour, Motor motor, Tyres tyres) {
        super(name, price, colour, tyres);
        this.motor = motor;
    }

    public Double getMotorSize() {
        return this.motor.getSize();
    }

}
