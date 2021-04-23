package shelter;

import com.sun.nio.file.SensitivityWatchEventModifier;

public class VirtualPet {

    private String name;
    private String type;
    private int hungerLevel = 10;
    private int thirstLevel = 10;
    private int boredomLevel = 10;

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

    public void stats(){
        System.out.println("Hunger: " + hungerLevel + "/nThirsty: " + thirstLevel + "/nBoredom: " + boredomLevel );
    }

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

    public void feedPets() {
        if (hungerLevel >= 10){
            hungerLevel -= 10;
        } else {
            hungerLevel = 0;
        }
    }

    public void giveWater() {
        if (thirstLevel >= 10) {
            thirstLevel -= 10;
        } else {
            thirstLevel = 0;
        }
    }

    public void play() {
        if (boredomLevel >= 10) {
            boredomLevel -= 10;
        } else {
            boredomLevel = 0;
        }
    }

    public void tick() {
        hungerLevel += 10;
        thirstLevel += 10;
        boredomLevel += 10;
    }
}
