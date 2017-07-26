import NewCar.Car;

/**
 * Created by Роман on 26.07.2017.
 */
public class Loader {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine(10);
//        car.engine=20;
        System.out.println(car.getEngine());
        Car car1 = new Car(20);
        System.out.println(car1.getEngine());


    }
}
