public class SubscribersPassengers extends Passenger{


    public SubscribersPassengers(String name, String ID) {
        super(name, ID);
    }

    @Override
    public void reserveCar(Car car) {
        try {

            if (car.getMaxPassengers() == 0) {
                throw new RuntimeException("Error can not add " + car.getCode() + " Maximum capacity of the car is zero.");
            }
            setReservedCar(car);
            setTripCost(car.getRoute().getTripPrice() * 0.5);
        }catch (RuntimeException e){
            System.out.println("Error : " + e.getMessage());
        }
    }

    @Override
    public void displayInfo() {
        if(getReservedCar() != null){
            System.out.println("Name: " + getName());
            System.out.println("Subscribed user");
            System.out.println("ID: " + getID());
            System.out.println("reserved car code: " + getReservedCar().getCode());
            System.out.println("Route Price: " + getReservedCar().getRoute().getTripPrice());
            System.out.println("Discount: " + (getReservedCar().getRoute().getTripPrice() - getTripCost()));
            System.out.println("Trip cost: " + getTripCost());
            System.out.println("==========================");
        }
    }
}
