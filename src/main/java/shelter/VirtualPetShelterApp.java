package shelter;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {

    private static Object VirtualPet;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPetShelter petShelter = new VirtualPetShelter();
        VirtualPet myPet = new VirtualPet("Bulma", "cat", 10, 10, 10);
        VirtualPet myPet2 = new VirtualPet("Arasu","dog");

        petShelter.addPetToShelter(myPet);
        petShelter.addPetToShelter(myPet2);

        System.out.println("Welcome to Filsan's Animal Shelter! Thank you for choosing to volunteer with us today.");
        System.out.println("Before we begin, Please enter your name into the volunteer sign up page. ");
        String name = input.nextLine();
        System.out.println();

        int select;

        while (true) {
            System.out.println("Please select a number between 0 - 4 so we can take care of our pets! ");
            System.out.println("Select 0 to Quit. ");
            System.out.println("Select 1 to intake a pet to the shelter. ");
            System.out.println("Select 2 to adopt a pet. ");
            System.out.println("Select 3 to feed a pet. ");
            System.out.println("Select 4 to give pet water. ");
            System.out.println("Select 5 to play with a pet. ");

            select = input.nextInt();

            if (select == 0) {
                System.out.println("Quit the program");
                System.exit(0);
            } else if (select == 1) {
                System.out.println("Enter the name of the pet you want to intake into the shelter.");
                String petName = input.nextLine();
                VirtualPet newPet = new VirtualPet(petName, "dog");
                petShelter.addPetToShelter(newPet);
            } else if (select == 2) {
                System.out.println("Enter the name of the pet you want to adopt.");
                String petName = input.nextLine();
                petShelter.removePetFromShelter(petName);
            } else if (select == 3) {
                petShelter.feedPets();
                System.out.println("We just feed our pets.");
            } else if (select == 4) {
                petShelter.waterToPets();
                System.out.println("We just gave our pets water.");
            } else if (select == 5) {
                System.out.println("Enter the name of the pet you want to play with.");
                String petName = input.nextLine();
                petShelter.playWithPet(petName);
            }
            petShelter.stats();

            petShelter.groupTick();
        }
    }
}
