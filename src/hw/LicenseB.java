package hw;

public class LicenseB extends Driver<Car> {

    public LicenseB(String nameDriver, Integer drivingExperience) {
        super(nameDriver, "B", drivingExperience);
    }


    @Override
    public void start(Car transport) {
        System.out.println("Водитель " + getNameDriver() + " участвует в заезде. Начал движение на легковом автомобиле "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }

    @Override
    public void stop(Car transport) {
        System.out.println("Водитель " + getNameDriver() + " приехал на легковом автомобиле " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void refuel(Car transport) {
        System.out.println("Водитель " + getNameDriver() + " заправил легковой автомобиль " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

}
