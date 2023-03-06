package Homework_OOP_2;

public class Bicycle extends Transport implements ChangeableTires{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на велосипеде");
    }
}
