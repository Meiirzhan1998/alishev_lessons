package practiceJSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.CharArrayReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonSimpleParser {

    private static final String TAG_NAME_MAIN = "name";
    private static final String TAG_CAR = "car";
    private static final String TAG_MODEL = "model";
    private static final String TAG_VOLUME = "volume";
    private static final String TAG_CREATED_DATE = "createdDate";
    private static final String TAG_NUMBER_OF_DOORS = "numberOfDoors";

    public Root parse() {

        Root root = new Root();

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("car.json")) {

            JSONObject rootJsonObject = (JSONObject) parser.parse(reader);

            String model = (String) rootJsonObject.get(TAG_NAME_MAIN);

            JSONArray carJsonArray = (JSONArray) rootJsonObject.get(TAG_CAR);


            List<Car> carList = new ArrayList<>();
            for(Object it: carJsonArray){
                JSONObject carJsonObject = (JSONObject) it;

                String modelCar = (String) carJsonObject.get(TAG_MODEL);
                double volumeCar = (Double) carJsonObject.get(TAG_VOLUME);
                long createdDateCar = (Long) carJsonObject.get(TAG_CREATED_DATE);
                long numberOfDoorsCar = (Long) carJsonObject.get(TAG_NUMBER_OF_DOORS);

                Car car = new Car(modelCar,volumeCar,(int)createdDateCar,(int)numberOfDoorsCar);
                carList.add(car);
            }

            root.setModel(model);
            root.setCar(carList);

            return root;
        } catch (Exception e) {
            System.out.println("Parsing error" + e.toString());
        }
        return null;
    }
}
