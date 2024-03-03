import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


    Route route1 = new Route("Tuwaiq Academy", "East", 50.0);
    Route route2 = new Route("West", "Tuwaiq Academy", 70.0);

    Car car1 = new Car("CAR001", 4, route1);
    Car car2 = new Car("CAR002", 0, route2);

    List<Passenger> passengers = new ArrayList<>();
    passengers.add(new SubscribersPassengers("mohammed", "pass001"));
    passengers.add(new nonSubscribersPassengers("Salman", "pass002", true));

    passengers.get(0).reserveCar(car1);
    passengers.get(1).reserveCar(car2);

    for (Passenger passenger : passengers) {
        passenger.displayInfo();
    }

    }
}