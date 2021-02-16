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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }
}
