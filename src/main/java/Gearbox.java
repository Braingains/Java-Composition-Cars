public class Gearbox {

    private String gearboxType;
    private int numberOfGears;

    public Gearbox(String gearboxType, int numberOfGears) {
        this.gearboxType = gearboxType;
        this.numberOfGears = numberOfGears;
    }

    public String getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }
}
