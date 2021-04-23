package shelter;

import com.sun.nio.file.SensitivityWatchEventModifier;

public class VirtualPet {

    private String name;
    private String type;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;

    public String getName(){
        return name;
    }
    public int getHungerLevel(){
        return hungerLevel;
    }

    public int getThirstLevel(){
        return thirstLevel;
    }

    public int getBoredomLevel(){
        return boredomLevel;
    }

    public VirtualPet(String name, int hungerLevel, int thirstLevel, int boredomLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;

    }

    public VirtualPet(String name, String type) {
        this.name = name;
        this.type = type;
    }


    public void feedPets() {
        if (hungerLevel >= 5){
            hungerLevel -= 5;
        } else (hungerLevel = 0);
    }
}
