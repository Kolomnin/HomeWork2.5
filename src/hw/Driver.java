package hw;

public abstract class Driver<T extends Transport> {

    private final String nameDriver;
    private static String licenseDriver;
    private Integer drivingExperience;

    public Driver(String nameDriver, String licenseDriver, Integer drivingExperience) {
        this.nameDriver = nameDriver;
        setLicenseDriver(licenseDriver);
        setDrivingExperience(drivingExperience);

    }

    public String getNameDriver() {
        return nameDriver;
    }

    public static String getLicenseDriver() {
        return licenseDriver;
    }

    public void setLicenseDriver(String licenseDriver) {
        if (licenseDriver == null || licenseDriver.isBlank()){
            Driver.licenseDriver = "У меня нет права на вождение автомобилем";
            System.out.println();
        } else {
            Driver.licenseDriver = licenseDriver;
        }
    }

    public Integer getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(Integer drivingExperience) {
        if (drivingExperience == null || drivingExperience < 0) {
            this.drivingExperience = 1;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }

    public abstract void start(T transport);

    public abstract void stop(T transport);

    public abstract void refuel(T transport);

    @Override
    public String toString() {
        return "Водитель " + nameDriver + ", категория прав: " + licenseDriver + ", стаж вождения: " + drivingExperience + " лет.";
    }
}
