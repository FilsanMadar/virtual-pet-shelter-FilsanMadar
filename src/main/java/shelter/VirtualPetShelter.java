package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> shelter = new HashMap<String, VirtualPet>();

    public void removePetFromShelter(String name) {
        shelter.remove(name);
    }
    public Collection<VirtualPet> pets() {
        return shelter.values();
    }

    public VirtualPet getPet(String name) {
        return shelter.get(name);
    }

    public void addPetToShelter(VirtualPet myPet) {
        shelter.put(myPet.getName(), myPet);
    }


    public int getSize() {
        return shelter.size();
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
        VirtualPet getPet = shelter.get(name);
        getPet.play();
    }

    public void groupTick() {
        for (VirtualPet pet: pets()) {
            pet.tick();
        }
    }

    public void stats(){
        System.out.println(" Name Hunger Thirst Boredome ");
        for (VirtualPet pet: pets()) {
            System.out.println( pet.getName() + "\tHunger: " + pet.getHungerLevel() + "\tThirsty: " + pet.getThirstLevel() + "\tBoredom: " + pet.getBoredomLevel());
        }
    }


}
