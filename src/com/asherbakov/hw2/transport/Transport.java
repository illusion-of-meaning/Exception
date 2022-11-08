package com.asherbakov.hw2.transport;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;
    protected final String EMPTY_STRING_VALUE = "параметр не задан";

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand.isBlank() ? EMPTY_STRING_VALUE : brand;
        this.model = model.isBlank() ? EMPTY_STRING_VALUE : model;
        setEngineVolume(engineVolume);
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.2;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

//    protected void passDiagnostics(Transport transport) {
//        System.out.printf("%s %s проходит диагностику.", transport.getBrand(), transport.getModel());
//    }

    public abstract boolean passDiagnostics();

    protected abstract void startMoving();

    protected abstract void stopMoving();

}
