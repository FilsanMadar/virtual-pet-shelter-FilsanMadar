package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> underTest = new HashMap<String, VirtualPet>();

    public Collection<VirtualPet> pets() {
        return underTest.values();
    }

    public VirtualPet getPet(String name) {
        return underTest.get(name);
    }

    public void addPetToShelter(VirtualPet myPet) {
        underTest.put(myPet.getName(), myPet);
    }

    public int getSize() {
        return underTest.size();
    }

    public void removePetFromShelter(String name) {
        underTest.remove(name);
    }

    public void feedPets() {
        for (VirtualPet pet : pets()) {
            pet.feedPets();
        }
    }

    public void waterToPets() {
        for (VirtualPet pet : pets()) {
            pet.giveWater();
        }
    }

    public void playWithPet(String name) {
        VirtualPet getPet = underTest.get(name);
        getPet.play();
    }

    public void groupTick() {
        for (VirtualPet pet: pets()) {
            pet.tick();
        }
    }

    public void playWithPet() {
    }

    public void removePetFromShelter() {
    }

    public void addPetToShelter() {
    }
}
