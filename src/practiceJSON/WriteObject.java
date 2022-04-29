package practiceJSON;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", 3.2, 2005,2);
        Car car2 = new Car("Toyota", 2.5, 2008, 4);
        Car car3 = new Car("Mercedes", 2.0, 2014, 4);
        try {
            FileOutputStream fos = new FileOutputStream("car.json");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(car1);
            oos.writeObject(car2);
            oos.writeObject(car3);

            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
