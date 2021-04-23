package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> shelter = new HashMap<String, VirtualPet>();

    public Collection<VirtualPet> pets() {
        return shelter.values();
    }

    public VirtualPet getPet(String name) {
        return shelter.get(name);
    }

    public void addPetToShelter(VirtualPet myPet) {
        shelter.put(myPet.getName(), myPet);
    }

}
