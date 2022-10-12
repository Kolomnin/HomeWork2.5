package hw;

public class Car extends Transport implements Сompeting {

    public Car(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println(" участвует в заезде. Начал движение на легковом автомобиле ");
    }

    @Override
    public void endMoving() {
        System.out.println(" приехал на легковом автомобиле ");
    }

    public void pitStop() {
        System.out.println("Я на Пит-Стопе 15 сек");
    }

    public void bestLapTime() {
        System.out.println("Лучшее время круга 1 мин. 30 сек.");
    }

    public void maxSpeed() {
        System.out.println("Максимальная скорость 220 км/ч");
    }

    @Override
    public String toString() {
        return "Автомобиль: " +
                "\nмарка " + getBrand() +
                ",\nмодель " + getModel() +
                ",\nобъем двигателя " + getEngineVolume();
    }

}



