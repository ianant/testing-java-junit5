package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

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
    @Disabled
    void oupsHandler() {
        assertTrue("notimplemented".equals(indexController.oupsHandler()),()->"this is some fancy message through" +
                "lambda");
    }

    @Test
    @DisplayName("Exception throws")
    void oupsHandlerException() {
        assertThrows(ValueNotFoundException.class,()->indexController.oupsHandler());
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testMeOnMACOS(){

    }
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testMeOnWindowsOS(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void testMeOnJava8(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void testMeOnJava11(){

    }

    @Test
    @EnabledIfEnvironmentVariable(named = "user",matches = "anant")
    void testIfUserAnant(){

    }

    @Test
    @EnabledIfEnvironmentVariable(named = "user",matches = "k")
    void testIfUserSomeOneElse(){

    }
}