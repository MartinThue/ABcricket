import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<member> memberlist = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        mainMenu();


    }

    public static void mainMenu() throws FileNotFoundException {
        System.out.println("Akademisk Boldklub Cricket");
        Scanner userInput = new Scanner(System.in);
        //Main menu
        boolean quit = false;
        do {
            System.out.println("\nHOVEDMENU\n1) Håndtering af Medlemmer \n2) Kampprogram og træningstider\n3) stævner og resultater\n0) Afslut program");
            System.out.print("Vælg: ");
            int option = userInput.nextInt();
            switch (option) {
               /*
                   Case 1 = Håndtering af Medlemmer
                   Case 2 = Kampprogram og resultater
                   Case 3 = Træningstider
                   Case 4 = Stævner
                   Case 0 = Afslut program
               */
                case 1:
                    //Håndtering af medlemmer
                    System.out.println("\nHåndtering af medlemmer\n1) Opret nyt medlem\n2) rediger medlems oplysninger\n3) afmeld medlem\n0) Tilbage");
                    System.out.print("Vælg: ");
                    option = userInput.nextInt();
                    if(option == 1) {
                        createMember(userInput);
                    }

            }
        }while (!quit);
    }

    public static void createMember(Scanner userInput){
        System.out.println();
    }


}
