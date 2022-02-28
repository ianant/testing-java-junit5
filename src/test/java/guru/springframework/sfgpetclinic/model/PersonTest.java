package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAsserstions() {
        //given
            Person person = new Person(1l,"Anant","Tripathi");

        //then
            assertAll("testing group of assertions",
                    ()->assertEquals("Anant",person.getFirstName()),
                    ()->assertEquals("Tripathi",person.getLastName()));
    }

    @Test
    void groupAssertionMsgs() {
        //given
        Person person = new Person(1l,"Anant","Tripathi");

        //then
        assertAll("testing group of assertions",
                ()->assertEquals("Kritika",person.getFirstName(),"First Name failed"),
                ()->assertEquals("Tripathi",person.getLastName(),"last name failed"));
    }
}