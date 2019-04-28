public class ElectricCar extends Car{
    int battery;

    public ElectricCar(String brand, colorSet color, int battery) {
        super(brand, color);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "battery=" + battery +
                ", brand='" + brand + '\'' +
                ", color=" + color +
                '}';
    }
}
