package plane;

public class Plane {
    private String model;
    private String country;
    private int year;
    private Double hours;
    private boolean isMilitary;
    private double weight;
    private double topSpeed;
    private int seats;
    private double cost;

    public Plane(String model, String country) {
        this.model = model;
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getHours() {
        return hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void printInfo() {
        System.out.printf("Model name - %s\n", model);
        System.out.printf("Plane belongs to %s\n", country);
        System.out.printf("Plane publishing year - %d\n", year);
        System.out.printf("Plane hours in air - %.2f\n", hours);
        System.out.printf("Plane is %s\n", (isMilitary ? "military" : "not military"));
        System.out.printf("Plane weight is %.2f KG\n", weight);
        System.out.printf("Plane top speed - %.2f km/h\n", topSpeed);
        System.out.printf("Plane number of seats - %d\n", seats);
        System.out.printf("Plane cost - %.2f$\n", cost);
    }
}
