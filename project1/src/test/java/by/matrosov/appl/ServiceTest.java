package by.matrosov.appl;

import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceTest {

    @Test
    public void getMessage() {
        Service service = new Service();
        assertEquals("service project1", service.getMessage());
    }
}