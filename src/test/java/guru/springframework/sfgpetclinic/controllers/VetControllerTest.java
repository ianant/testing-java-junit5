package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.fauxspring.Model;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.service.ControllerTest;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.ModelMapImpl;
import guru.springframework.sfgpetclinic.services.map.SpecialityMapService;
import guru.springframework.sfgpetclinic.services.map.VetMapService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class VetControllerTest implements ControllerTest {

    VetController vetController;
    VetService service;
    SpecialtyService specialtyService;
    Model model;
    @BeforeEach
    void setUp() {
        specialtyService=new SpecialityMapService();
        service= new VetMapService(specialtyService);
        vetController=new VetController(service);
        Vet vet1=new Vet(1l,"Anant","Tripathi",null);
        Vet vet2=new Vet(2l,"Kritika","Mishra",null);
        service.save(vet1);
        service.save(vet2);
    }

    @Test
    void listVets() {
        Model model=new ModelMapImpl();
        String view =vetController.listVets(model);
        assertEquals("vets/index",vetController.listVets(model));
        Set modelAttr= (Set) ((ModelMapImpl) model).getMap().get("vets");
        Assertions.assertThat(modelAttr.size()).isEqualTo(2);
    }

    @RepeatedTest(value = 10,name = "{displayName} : {currentRepetition} - {totalRepetitions}")
    @DisplayName("My Repeated Tests")
    void myRepeatedTests(){

    }
}