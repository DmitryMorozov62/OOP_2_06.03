package Homework_OOP_2;

public class Truck extends Transport implements CheckableEngine,CheckableTrailer{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовой машиной");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовой машиной");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицем грузовой машиной");
    }
}
