package practiceJSON;


public class Car {
    private String model;
    private double volume;
    private int createdDate;
    private int numberOfDoors;

    public Car (String model,double volume, int createdDate, int numberOfDoors){
        this.model=model;
        this.volume=volume;
        this.createdDate=createdDate;
        this.numberOfDoors=numberOfDoors;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setCreatedDate(int createdDate) {
        this.createdDate = createdDate;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getModel(){
        return model;
    }
    public double getVolume(){
        return volume;
    }
    public int getCreatedDate(){
        return createdDate;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", volume=" + volume +
                ", createdDate=" + createdDate +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
