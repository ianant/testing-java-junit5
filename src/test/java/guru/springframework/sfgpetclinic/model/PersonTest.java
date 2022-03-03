package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.service.ModelTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements ModelTest {

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
                ()->assertEquals("Anant",person.getFirstName(),"First Name failed"),
                ()->assertEquals("Tripathi",person.getLastName(),"last name failed"));
    }

}