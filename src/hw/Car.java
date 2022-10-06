package hw;

public class Car extends Transport implements Сompeting {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
        return "Легковой автомобиль: " +
                "\nмарка " + getBrand() +
                ",\nмодель " + getModel() +
                ",\nобъем двигателя " + getEngineVolume();
    }
}



