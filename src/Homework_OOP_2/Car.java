package Homework_OOP_2;

public class Car extends MotorTransport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service(Transport transport) {
        super.checkTransport((WheeledTransport) transport);
        super.checkEngine();
    }
}
