package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class VirtualPetShelterTest {

    private VirtualPetShelter underTest;


    @BeforeEach
    public void setUp() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet myPet = new VirtualPet("Bulma", 50, 50, 50);
        VirtualPet myPet2 = new VirtualPet("Arasu", 50, 50, 50);
        Collection<VirtualPet> pets = underTest.pets();
    }

    //intake//
    @Test
    public void shouldBeAbleToIntakePetToTheShelter() {
        VirtualPet myPet = new VirtualPet("Bulma", 50, 50, 50);
        VirtualPet myPet2 = new VirtualPet("Arasu", 50, 50, 50);
        int beginningSize = underTest.getAllPets().size();
        underTest.addPetToShelter(myPet);
        underTest.addPetToShelter(myPet2);
        int endingSize = underTest.getAllPets().size();
        assertTrue(endingSize > beginningSize);
    }

    //adoption//
    @Test
    public void shouldBeAbleToAdoptPetsFromShelter(){
        VirtualPet myPet = new VirtualPet("Bulma", 50, 50, 50);
        int beginningSize = underTest.getAllPets().size();
        underTest.addPetToShelter(myPet);
        underTest.removePetFromShelter(myPet);
        int endingSize = underTest.getAllPets().size();
        assertTrue(endingSize < beginningSize);

    }
}








