package hw;

public class Truck extends Transport implements Сompeting {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void pitStop() {
        System.out.println("Я на Пит-Стопе 30 сек");
    }

    public void bestLapTime() {
        System.out.println("Лучшее время круга 3 мин. 30 сек.");
    }

    public void maxSpeed() {
        System.out.println("Максимальная скорость 150 км/ч");
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль: " +
                "\nмарка " + getBrand() +
                ",\nмодель " + getModel() +
                ",\nобъем двигателя " + getEngineVolume();
    }

}
