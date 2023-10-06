public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car();
        firstCar.brand = "BMW";
        firstCar.model = "BMWi7";
        firstCar.year = 2023;
        firstCar.startEngine();
        firstCar.stopEngine();
        System.out.println("Brand:" + firstCar.brand);
        System.out.println("Model:" + firstCar.model);
        System.out.println("year:" + firstCar.year);



    }
}