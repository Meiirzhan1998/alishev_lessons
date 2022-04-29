package practiceJSON;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis= new FileInputStream("car.json");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Car car1 = (Car)ois.readObject();
            Car car2 = (Car)ois.readObject();
            Car car3 = (Car)ois.readObject();

            System.out.println(car1);
            System.out.println(car2);
            System.out.println(car3);

            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
