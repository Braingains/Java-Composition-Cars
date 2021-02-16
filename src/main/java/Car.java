public abstract class Car {

    private String model;
    private double price;
    private String colour;
    private Tyres tyres;

    public Car(String model, double price, String colour, Tyres tyres) {
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.tyres = tyres;

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

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }


}
