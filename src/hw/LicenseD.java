package hw;

public class LicenseD extends Driver<Bus>{
    public LicenseD(String nameDriver, Integer drivingExperience) {
        super(nameDriver, "D", drivingExperience);
    }

    @Override
    public void start(Car transport) {
        System.out.println("Водитель " + getNameDriver() + " участвует в заезде. Начал движение на грузовике "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }


    @Override
    public void stop(Bus transport) {
        System.out.println("Водитель " + getNameDriver() + " приехал на грузовике " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void refuel(Bus transport) {
        System.out.println("Водитель " + getNameDriver() + " заправил грузовик " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }


}
