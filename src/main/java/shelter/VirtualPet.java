package shelter;

public class VirtualPet {

    private String name;
    private int hunger;
    private int water;
    private int play;

    public String getPetName() {
        return name;
    }
    public VirtualPet(String name, int hunger, int water, int play) {
        this.name = name;
        this.hunger = hunger;
        this.water = water;
        this.play = play;

    }


}
