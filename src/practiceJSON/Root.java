package practiceJSON;

import java.util.List;

public class Root {
    private String model;

    private List<Car> car;

    public Root(String model, List<Car> car) {
        this.model = model;
        this.car = car;
    }
    public Root(){}


    public void setModel(String model) {
        this.model = model;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    public String getModel() {
        return model;
    }

    public List<Car> getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Root{" +
                "model='" + model + '\'' +
                ", car=" + car +
                '}';
    }
}
