package Homework_OOP_2;

public class ServiceStationForDirector implements ServiceStation {

    @Override
    public void check(Car car) {
        checkTransport(car);
        car.checkEngine();
    }

    @Override
    public void check(Bicycle bicycle) {
        checkTransport(bicycle);
    }

    @Override
    public void check(Truck truck) {
        checkTransport(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

    private void checkTransport(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
}
