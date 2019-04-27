public class Car {
    public Car(String volvo, String dark_gray) {
    }

    public enum colorSet {
        white,
        silver,
        black,
        red_metallic,
        blue_metallic,
        dark_grey};

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color=" + color +
                '}';
    }

    protected String brand;
    protected colorSet color;
    public Car(String brand, colorSet color){
        this.brand = brand;
        this.color = color;
    }

    public colorSet getColor() {
        return color;
    }

    public void setColor(colorSet color) {
        this.color = color;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
}
