public class Car {
private String code;
private Route route;
private int maxPassengers;

    public Car(String code, int maxPassengers,Route route) {
        this.code = code;
        this.maxPassengers = maxPassengers;
        this.route = route;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
