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
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.addPetToShelter(myPet);
        int check = underTest.getSize();
        assertEquals(1, check);

    }

    @Test
    public void shouldBeAbleToAdoptPetFromTheShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet myPet = new VirtualPet("Bulma", "Russian Blue");
        VirtualPet myPet2 = new VirtualPet("Arasu", "Black Lab");
        underTest.addPetToShelter(myPet);
        underTest.addPetToShelter(myPet2);
        underTest.removePetFromShelter("Bulma");
        int check = underTest.getSize();
        assertEquals(1, check);
    }

    @Test
    public void petHungerShouldReturnToZeroAfterItHasBeenFed() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet myPet = new VirtualPet("Bulma", "Russian Blue");
        VirtualPet myPet2 = new VirtualPet("Arasu", "Black Lab");
        underTest.addPetToShelter(myPet);
        underTest.addPetToShelter(myPet2);
        underTest.feedPets();
        int check = myPet.getHungerLevel();
        int check2 = myPet2.getHungerLevel();
        assertEquals(0, check);
        assertEquals(0, check2);
    }

}








