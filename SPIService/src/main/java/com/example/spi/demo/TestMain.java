package com.example.spi.demo;

import java.util.Iterator;
import java.util.ServiceLoader;

public class TestMain {

    public static void main(String[] args) {
//        Content content = new Content(new SPIImpl01());
//        content.executeSPIService();
        ServiceLoader<SPIService> load = ServiceLoader.load(SPIService.class);
        Iterator<SPIService> iterable = load.iterator();
        while (iterable.hasNext()) {
            SPIService spiService = iterable.next();
            spiService.execute();
        }
    }
}
