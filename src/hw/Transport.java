package hw;

public abstract class Transport {
    private final String brand;
    private final String model;

    private Double engineVolume;

    public Transport(String brand, String model, double engineVolume) {

        if (isNullOfEmpty(brand)) {
            this.brand = "no information";
        } else {
            this.brand = brand;
        }

        if (isNullOfEmpty(model)) {
            this.model = "no information";
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
    }

    public Double getEngineVolume() {
        return engineVolume;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume == null || engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void startMoving() {
        System.out.println("Я начал движение");
    }

    public void endMoving() {
        System.out.println("Я остановился");
    }


//    public Integer getProductionYear() {
//        return productionYear;
//    }
//
//    public String getProductionCountry() {
//        return productionCountry;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        if (color == null || color.isBlank()) {
//            this.color = "белый";
//        } else {
//            this.color = color;
//        }
//    }
//
//    public Integer getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(Integer maxSpeed) {
//        if (maxSpeed == null || maxSpeed <= 0) {
//            this.maxSpeed = 180;
//        } else {
//            this.maxSpeed = maxSpeed;
//        }
//    }

//    public String getFuel() {
//        return fuel;
//    }


    //    public abstract void refill();
//
    public static boolean isNullOfEmpty(String value) {
        return value == null || value.isBlank();
    }

}
