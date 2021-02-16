public class Engine {

    private double size;
    private String engineType;

    public Engine (double size, String engineType) {
        this.size = size;
        this.engineType = engineType;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
