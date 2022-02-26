package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    public IndexController indexController;

    @BeforeEach
    void setUp() {
        indexController=new IndexController();
    }

    @Test
    void index() {
        assertEquals("index",indexController.index(),"Expected output is not correct");
        assertEquals("index",indexController.index(),()->"this is some fancy message through lambda expression");
    }

    @Test
    void oupsHandler() {
        assertTrue("notimplemented".equals(indexController.oupsHandler()),()->"this is some fancy message through" +
                "lambda");
    }
}