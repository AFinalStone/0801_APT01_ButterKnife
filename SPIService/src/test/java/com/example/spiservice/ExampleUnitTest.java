package com.example.spiservice;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        Content content = new Content(new SPIImpl01());
        content.executeSPIService();
//        ServiceLoader<SPIService> load = ServiceLoader.load(SPIService.class);
//        Iterator<SPIService> iterable = load.iterator();
//        while (iterable.hasNext()) {
//            SPIService spiService = iterable.next();
//            spiService.execute();
//        }
    }
}