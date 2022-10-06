package hw;

public class LicenseC extends Driver<Truck> {
    public LicenseC(String nameDriver, Integer drivingExperience) {
        super(nameDriver, "C", drivingExperience);
    }

    @Override
    public void start(Truck transport) {
        System.out.println("Водитель " + getNameDriver() + " участвует в заезде. Начал движение на грузовике "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }

    @Override
    public void stop(Truck transport) {
        System.out.println("Водитель " + getNameDriver() + " приехал на грузовике " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }


    @Override
    public void refuel(Truck transport) {
        System.out.println("Водитель " + getNameDriver() + " заправил грузовик " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

}
