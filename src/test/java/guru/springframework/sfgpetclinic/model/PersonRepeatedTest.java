package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class PersonRepeatedTest implements PersonRepeatedResolverTest{
    @RepeatedTest(value = 5,name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("My Repeated DI")
    void myRepeaatedTestDI(){
        System.out.println("su");
    }
}
