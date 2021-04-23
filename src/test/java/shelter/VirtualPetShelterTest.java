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
        VirtualPet myPet = new VirtualPet("Bulma", 10, 10, 10);
        VirtualPet myPet2 = new VirtualPet("Arasu", 10, 10, 10);
        Collection<VirtualPet> pets = underTest.pets();
    }

    @Test
    public void shouldBeAbleToIntakePetToTheShelter() {
        VirtualPet myPet = new VirtualPet("Bulma", 10, 10, 10);
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
        VirtualPet myPet = new VirtualPet("Bulma", 10, 10, 10);
        VirtualPet myPet2 = new VirtualPet("Arasu", 10, 10, 10);
        underTest.addPetToShelter(myPet);
        underTest.addPetToShelter(myPet2);
        underTest.feedPets();
        int check = myPet.getHungerLevel();
        int check2 = myPet2.getHungerLevel();
        assertEquals(0, check);
        assertEquals(0, check2);
    }

    @Test
    public void petThirstShouldReturnToZeroAfterDrinking() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet myPet = new VirtualPet("Bulma", 10, 10, 10);
        VirtualPet myPet2 = new VirtualPet("Arasu", 10, 10, 10);
        underTest.addPetToShelter(myPet);
        underTest.addPetToShelter(myPet2);
        underTest.waterToPets();
        int check = myPet.getThirstLevel();
        int check2 = myPet2.getThirstLevel();
        assertEquals(0, check);
        assertEquals(0, check2);
    }

    @Test
    public void petBoredomShouldReturnToZeroAfterPlaying() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet myPet = new VirtualPet("Bulma", 10, 10, 10);
        VirtualPet myPet2 = new VirtualPet("Arasu", 10, 10, 10);
        underTest.addPetToShelter(myPet);
        underTest.addPetToShelter(myPet2);
        underTest.playWithPet("Bulma");
        int check = myPet.getBoredomLevel();
        assertEquals(0, check);
    }

    @Test
    public void petStatLevelsReturnToTenAfterTick() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet myPet = new VirtualPet("Bulma", "Russian Blue");
        VirtualPet myPet2 = new VirtualPet("Arasu", "Black Lab");
        underTest.groupTick();
        int check = myPet.getBoredomLevel();
        int check2 = myPet.getThirstLevel();
        int check3 = myPet.getHungerLevel();
        int check4 = myPet2.getBoredomLevel();
        int check5 = myPet2.getThirstLevel();
        int check6 = myPet2.getHungerLevel();
        assertEquals(20, check);
        assertEquals(20, check2);
        assertEquals(20, check3);
        assertEquals(20, check4);
        assertEquals(20, check5);
        assertEquals(20, check6);
    }
}








