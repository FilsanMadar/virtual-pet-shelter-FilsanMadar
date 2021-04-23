package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetShelterTest {

    private VirtualPetShelter underTest;

    @BeforeEach
    public void setUp() {
        VirtualPetShelter underTest = new VirtualPetShelter();
    }

    @Test
    public void shouldBeAbleToAddPetToTheShelter() {
        VirtualPet myPet = new VirtualPet("Bulma", 50, 50, 50);
        VirtualPet myPet2 = new VirtualPet("Arasu", 50, 50, 50);
        underTest.addPetToShelter(myPet);
        String petFound = underTest.findPetInShelter("Bulma");
        assertEquals("Bulma" ,petFound);
    }
    
}








