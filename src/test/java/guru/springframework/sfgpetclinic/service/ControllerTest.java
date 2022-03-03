package guru.springframework.sfgpetclinic.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("Controller")
public interface ControllerTest {
    @BeforeAll
    default void setUpBeforeControllerTest(){
        System.out.println("Do Something:::");
    }
}
