package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

public class OwnerParameterisedTest implements OwnerParameterisedTestInterface{
    @DisplayName("My Parameterised Test")
    @ParameterizedTest(name = ParameterizedTest.DISPLAY_NAME_PLACEHOLDER +" "+
            ParameterizedTest.INDEX_PLACEHOLDER +" - "+
            ParameterizedTest.ARGUMENTS_PLACEHOLDER)
    @ValueSource(strings={"Spring","Framework","Testings"})
    void myParameterisedTest(String val){
        System.out.println(val);
    }

    @DisplayName("ENUM Parameterised Test")
    @ParameterizedTest(name = ParameterizedTest.DISPLAY_NAME_PLACEHOLDER +" "+
            ParameterizedTest.INDEX_PLACEHOLDER +" - "+
            ParameterizedTest.ARGUMENTS_PLACEHOLDER)
   @EnumSource(OwnerType.class)
    void myParameterisedTestENUM(OwnerType oType){
        System.out.println(oType);
    }


    @DisplayName("CSV input Parameterised Test")
    @ParameterizedTest(name = ParameterizedTest.DISPLAY_NAME_PLACEHOLDER +" "+
            ParameterizedTest.INDEX_PLACEHOLDER +" - "+
            ParameterizedTest.ARGUMENTS_PLACEHOLDER)
    @CsvSource({
        "MH,1,1",
        "UP,2,2",
        "KA,3,3"
    })
    void myParameterisedTestCSVInput(String state,int val1,int val2){
        System.out.println(state + " = "+" "+val1+" - "+val2);
    }

    @DisplayName("CSV input from FIle Parameterised Test")
    @ParameterizedTest(name = ParameterizedTest.DISPLAY_NAME_PLACEHOLDER +" "+
            ParameterizedTest.INDEX_PLACEHOLDER +" - "+
            ParameterizedTest.ARGUMENTS_PLACEHOLDER)
    @CsvFileSource(resources = "/index.csv", numLinesToSkip = 1)
    void myParameterisedTestCSVInputFromFile(String state,int val1,int val2){
        System.out.println(state + " = "+" "+val1+" - "+val2);
    }

    @DisplayName("method provider Parameterised Test")
    @ParameterizedTest(name = ParameterizedTest.DISPLAY_NAME_PLACEHOLDER +" "+
            ParameterizedTest.INDEX_PLACEHOLDER +" - "+
            ParameterizedTest.ARGUMENTS_PLACEHOLDER)
    @MethodSource("getArgs")
    void myParameterisedTestMethodProvider(String state,int val1,int val2){
        System.out.println(state + " = "+" "+val1+" - "+val2);
    }

    public static Stream<Arguments> getArgs(){
       return Stream.of(Arguments.of("MH",1,1),
                Arguments.of("UP",2,2),
                Arguments.of("AP",3,3));
    }
}
