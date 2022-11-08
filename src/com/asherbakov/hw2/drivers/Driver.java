package com.asherbakov.hw2.drivers;

import com.asherbakov.hw2.transport.Transport;
import com.asherbakov.hw2.transport.enums.RightsCategory;

public class Driver<T extends Transport> {
    final String NO_NAME = "Водитель пожелал остаться неизвестным";
    final String NO_TRANSPORT = "Водитель решил пройтись";
    private String fullName;
    private RightsCategory rightsCategory;
    private int experience;
    private T transport;

    public Driver(String fullName, int experience, T transport) {
        setTransport(transport);
        if (fullName != null && !fullName.isBlank()) {
            this.fullName = fullName;
        } else {
            this.fullName = NO_NAME;
        }
        setExperience(experience);
    }

//    public Driver(String fullName, int experience) {
//        if (fullName != null && !fullName.isBlank()) {
//            this.fullName = fullName;
//        } else {
//            this.fullName = NO_NAME;
//        }
//        setExperience(experience);
//    }

    public void start() {
        System.out.println("Начало движения");
    }

    public void stop() {
        System.out.println("Остановка");
    }

    public void fuel() {
        System.out.println("Заправить автомобиль");
    }

    public void race(T transport) {
        if (transport != null) {
            System.out.println(String.format("Водитель %s управляет автомобилем '%s' и будет участвовать в заезде.", getFullName(), transport.toString()));
        } else {
            System.out.println(String.format("Водитель %s управляет автомобилем '%s' и будет участвовать в заезде.", getFullName(), NO_TRANSPORT));
        }
    }

    public String getFullName() {
        return fullName;
    }

    public RightsCategory getRightsCategory() {
        return rightsCategory;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience > 0) {
            this.experience = experience;
        } else {
            this.experience = 1;
        }
    }

    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        if (transport == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        }
        this.transport = transport;
    }
}
