package Homework_OOP_2;

public class Car extends Transport implements CheckableEngine{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку легковой машине");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель легковой машине");
    }
}
