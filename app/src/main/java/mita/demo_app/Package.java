package mita.demo_app;

public class Package {

    String id;
    Double size;
    Double weight;
    boolean fragile;
    boolean highValue;

    public Package() {
    }

    public Package(String id, Double size, Double weight, boolean fragile, boolean highValue) {
        this.id = id;
        this.size = size;
        this.weight = weight;
        this.fragile = fragile;
        this.highValue = highValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public boolean isHighValue() {
        return highValue;
    }

    public void setHighValue(boolean highValue) {
        this.highValue = highValue;
    }
}
