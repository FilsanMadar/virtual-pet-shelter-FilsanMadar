package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetShelterTest {

    VirtualPetShelter underTest;
    VirtualPet Bulma;
    VirtualPet Arasu;
    VirtualPet Blue;

    @BeforeEach
    public void setUp(){
        underTest = new VirtualPetShelter();
        Bulma = new VirtualPet("Russian Blue Cat", " Cage 1", 2);
        Arasu = new VirtualPet("Black Lab", "Cage 2", 2);
        Blue = new VirtualPet("Horse", "Cage 3", 2);
    }

    @Test
    public void shouldAdmitPetToTheShelter(){
        underTest.

    }



}
