package Homework_OOP_2;

public class Bicycle extends WheeledTransport{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service(Transport transport) {
        super.checkTransport((WheeledTransport) transport);
    }
}
