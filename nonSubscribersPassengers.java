public class nonSubscribersPassengers extends Passenger{

boolean coupon;
    public nonSubscribersPassengers(String name, String ID, boolean coupon) {
        super(name, ID);
        this.coupon = coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public void reserveCar(Car car) {
        try {

            if (car.getMaxPassengers() == 0) {
                throw new RuntimeException("Error can not add " + car.getCode() + " Maximum capacity of the car is zero.");
            }
            setReservedCar(car);
            if (coupon) {
                setTripCost(car.getRoute().getTripPrice() - (car.getRoute().getTripPrice() * 0.1));
            } else {
                setTripCost(car.getRoute().getTripPrice());
            }
        }catch (RuntimeException e){
            System.out.println("Error : " + e.getMessage());
        }
    }

    @Override
    public void displayInfo() {
        if(getReservedCar() != null) {
            System.out.println("Name: " + getName());
            System.out.println("ID: " + getID());
            System.out.println("Reserved Car Code: " + getReservedCar().getCode());
            System.out.println("Route Price: " + getReservedCar().getRoute().getTripPrice());
            System.out.println("Discount: " + (getReservedCar().getRoute().getTripPrice() - getTripCost()));
            System.out.println("Trip Cost: " + getTripCost());
            System.out.println("==========================");

        }
    }
}
