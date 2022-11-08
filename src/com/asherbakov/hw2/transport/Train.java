package com.asherbakov.hw2.transport;

import com.asherbakov.hw2.interfaces.Compating;

public class Train extends Transport implements Compating {

    public Train(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    protected void startMoving() {

    }

    @Override
    protected void stopMoving() {

    }

//    @Override
//    public void passDiagnostics() {
//        super.passDiagnostics(this);
//    }


    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.75;
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик на пит-стопе");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время для грузовика - 5:09");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость грузовика: 108 км/ч");
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.getBrand(), super.getModel());
    }
}
