
public class Samochody {
    public static void main(String args[]){ // press psvm and then tab
        Car car1 = new Car("volvo", Car.colorSet.dark_grey);
        System.out.println(car1.getBrand());
        System.out.println(car1.toString());

        ElectricCar carE1 = new ElectricCar("Toyota", Car.colorSet.blue_metallic, 1024);
        System.out.println(carE1.toString());

        FuelCar carF1 = new FuelCar("WV", Car.colorSet.black, 2500);
        System.out.println(carF1.toString());
    }

}
