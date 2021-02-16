import com.sun.xml.internal.ws.api.pipe.Engine;

public abstract class Car {

    private String model;
    private double price;
    private String colour;
    private Engine engine;
    private Tyres tyres;
    private Gearbox gearbox;

    public Car(String model, double price, String colour) {
        this.model = model;
        this.price = price;
        this.colour = colour;
//        engine = new Engine();
//        tyres = new Tyres();
//        gearbox = new Gearbox();


    }

}
