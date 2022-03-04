package guru.springframework.sfgpetclinic.model;
import guru.springframework.sfgpetclinic.service.ModelTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest implements ModelTest {
    @Test
    void  dependentAssertion(){
        Owner owner=new Owner(1l,"Anant","Tripathi");
        owner.setCity("Gorakhpur");
        owner.setTelephone("8880494606");
        assertAll("properties test",
                ()->assertAll("person properties:",
                        ()->assertEquals("Anant",owner.getFirstName()),
                        ()->assertEquals("Tripathi",owner.getLastName())),
                ()->assertAll("owner properties::",
                        ()->assertEquals("Gorakhpur",owner.getCity()),
                        ()->assertEquals("8880494606",owner.getTelephone())));
                }

}