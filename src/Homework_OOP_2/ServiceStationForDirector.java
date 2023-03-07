package Homework_OOP_2;

public class ServiceStationForDirector implements ServiceStation {

    @Override
    public void check(Transport transport) {
        checkTransport(transport);
        transport.checkEngine();
        transport.checkTrailer();
    }

    private void checkTransport(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
}
