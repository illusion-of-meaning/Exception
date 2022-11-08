package com.asherbakov.hw2;

import com.asherbakov.hw2.drivers.Driver;
import com.asherbakov.hw2.drivers.DriverCategoryB;
import com.asherbakov.hw2.drivers.DriverCategoryC;
import com.asherbakov.hw2.drivers.DriverCategoryD;
import com.asherbakov.hw2.transport.Bus;
import com.asherbakov.hw2.transport.Car;
import com.asherbakov.hw2.transport.Train;
import com.asherbakov.hw2.transport.Transport;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Vesta Sport", 1.8);
        Transport car2 = new Car("Lada", "Granta Drive Active", 1.6);
        Transport car3 = new Car("Nissan", "Skyline GT-R", 2.6);

        Transport bus1 = new Bus("ПАЗ", "320530/40-02", 4.6);
        Transport bus2 = new Bus("ПАЗ", "320530/40-04", 4.4);
        Transport bus3 = new Bus("ПАЗ", "320425-04 Vector NEXT", 4.4);

        Transport train1 = new Train("КАМАЗ", "5490", 11.7);
        Transport train2 = new Train("УРАЛ", "4320", 10.8);
        Transport train3 = new Train("УРАЛ", "NEXT", 11.7);

        service(car1, car2, car3, bus1, train1, train2, bus2, train3, bus3);
    }

    public static void service(Transport... transports) {
        for (Transport t : transports) {
            serviceTransport(t);
        }
    }

    public static void serviceTransport(Transport transport) {
        if (!transport.passDiagnostics()) {
            try {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
