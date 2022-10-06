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


//    public void setTransport(T transport) {
//        boolean a;
//            switch (this.transport) {
//                case "B":
//            a = transport instanceof Car;
//                case "C":
//            a = transport instanceof Bus;
//                case "D":
//            a = transport instanceof Truck;
//
//           }
//    }

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

    public abstract void start(Car transport);

    public abstract void stop(T transport);

    public abstract void refuel(T transport);



    @Override
    public String toString() {
        return "Водитель " + nameDriver + ", категория прав: " + licenseDriver + ", стаж вождения: " + drivingExperience + " лет.";
    }



   /* Между собой водители будут отличаться друг от друга по типу прав (соответственно, это три разных класса):

    для легковых авто нужна категория В
    для грузовых нужна категория С
    для автобусов – D
    Водитель с определённым типом прав может управлять только одним авто в выбранной категории. Управлять авто других категорий в наших соревнованиях он не может.

    Подсказка
    Напишите приложение, которое выводит в консоль информацию в формате:

            "водитель А управляет автомобилем Б и будет участвовать в заезде".

    На платформу в качестве выполненного задания пришлите ссылку на pull-request вашего проекта в GitHub.

            Критерии оценки
    Реализован класс водитель с набором параметром и методов
    Реализован класс водитель категории B
    Реализован класс водитель категории C
    Реализован класс водитель категории D
    Приложение выводит в консоль сообщение "водитель А управляет автомобилем Б и будет участвовать в заезде".*/


}
