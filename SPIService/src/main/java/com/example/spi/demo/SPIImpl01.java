package com.example.spi.demo;

public class SPIImpl01 implements SPIService {
    @Override
    public void execute() {
        System.out.println("SPIImpl01 execute");
    }
}
