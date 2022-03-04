package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

@Tag("repeated")
public interface PersonRepeatedResolverTest {
    @BeforeEach
    default void beforeEachMethod(TestInfo testInfo, RepetitionInfo rInfo){
        System.out.println("In default method: "+
                    testInfo.getDisplayName()+
                "- " + rInfo.getCurrentRepetition()+
                " | " + rInfo.getTotalRepetitions());
    }
}
