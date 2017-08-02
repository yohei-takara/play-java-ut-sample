package services;

import org.junit.Test;

import static org.junit.Assert.*;


public class DemoServiceTest {
    @Test
    public void demo() throws Exception {
        DemoService service = new DemoService();
        assertEquals(service.demo(), "demo");
    }

}