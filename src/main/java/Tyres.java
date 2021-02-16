public class Tyres {

    private String tyreType;
    private int tyreSize;

    public Tyres (String tyreType, int tyreSize) {
        this.tyreType = tyreType;
        this.tyreSize = tyreSize;
    }

    public String getTyreType() {
        return tyreType;
    }

    public void setTyreType(String tyreType) {
        this.tyreType = tyreType;
    }

    public int getTyreSize() {
        return tyreSize;
    }

    public void setTyreSize(int tyreSize) {
        this.tyreSize = tyreSize;
    }
}
