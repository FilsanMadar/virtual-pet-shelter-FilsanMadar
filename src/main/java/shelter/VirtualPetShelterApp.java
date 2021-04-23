package shelter;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet myPet = new VirtualPet("Bulma", 10, 10, 10);
        VirtualPet myPet2 = new VirtualPet("Arasu", 10, 10, 10);

        underTest.addPetToShelter(myPet);
        underTest.addPetToShelter(myPet2);

        System.out.println("Welcome to Filsan's Animal Shelter! Thank you for choosing to volunteer with us today.");
        System.out.println("Before we begin, Please enter your name into the volunteer sign up page. ");
        String name = input.nextLine();
        System.out.println();

        int select;

        while (true) {
            System.out.println("Please select a number between 0 - 4 so we can take care of your pet! ");
            System.out.println("Select 0 to Quit. ");
            System.out.println("Select 1 to intake a pet to the shelter. ");
            System.out.println("Select 2 to adopt a pet. ");
            System.out.println("Select 3 to feed a pet. ");
            System.out.println("Select 4 to play with a pet water. ");
            System.out.println("Select 5 to play with a pet. ");

            select = input.nextInt();

            if (select == 0) {
                System.out.println("Quit the program");
                System.exit(0);
            } else if (select == 1) {
                underTest.addPetToShelter();
                System.out.println("We just helped to intake a pet to the shelter.");
            } else if (select == 2) {
                underTest.removePetFromShelter();
                System.out.println("We just helped a pet get adopted.");
            } else if (select == 3) {
                underTest.feedPets();
                System.out.println("We just feed our pets.");
            } else if (select == 4) {
                underTest.waterToPets();
                System.out.println("We just gave our pets water.");
            } else if (select == 5) {
                underTest.playWithPet();
                System.out.println("We just played with our pets");
            }

            underTest.groupTick();
        }
    }
}
