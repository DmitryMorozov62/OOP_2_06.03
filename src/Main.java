import Homework_OOP_2.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1",4);
        Car car2 = new Car("car2",4);


        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2",8);


        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);


        ServiceStation station = new ServiceStationForDirector();

        printReport(station,car);
        printReport(station,car2);
        printReport(station,bicycle);
        printReport(station,bicycle2);
        printReport(station,truck);
        printReport(station,truck2);

    }
    private static void printReport(ServiceStation serviceStation, Car car){
        serviceStation.check(car);
    }
    private static void printReport(ServiceStation serviceStation, Bicycle bicycle){
        serviceStation.check(bicycle);
    }
    private static void printReport(ServiceStation serviceStation, Truck truck){
        serviceStation.check(truck);
    }
}