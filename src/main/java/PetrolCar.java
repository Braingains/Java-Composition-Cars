public class PetrolCar extends Car {

    private Engine engine;
    private Gearbox gearbox;

    public PetrolCar (String name, double price, String colour, Engine engine, Tyres tyres, Gearbox gearbox) {
        super(name, price, colour, tyres);
        this.engine = engine;
        this.gearbox = gearbox;
    }



}