package Homework_OOP_2;

public class Truck extends MotorTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void service(WheeledTransport transport) {
        checkTransport(transport);
        checkEngine();
        checkTrailer();
    }

}


