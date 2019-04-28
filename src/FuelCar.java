public class FuelCar extends Car {
    int capacity;

    public FuelCar(String brand, colorSet color, int capacity) {
        super(brand, color);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "FuelCar{" +
                "capacity=" + capacity +
                ", brand='" + brand + '\'' +
                ", color=" + color +
                '}';
    }
}
