import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner keyboard = new Scanner(System.in);
    private Database database = new Database();

    public void startProgram() {
        while (true) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    createSuperhero();
                    break;
                case 5:
                    searchSuperhero();
                    break;
                case 6:
                    editSuperhero();
                    break;
                case 7:
                    printSuperheroes();
                    break;
                case 9:
                    exitProgram();
                    break;
                default:
                    System.out.println("Ugyldigt valg. Prøv igen.");
            }
        }


    }
    public void closeScanner() {
        keyboard.close();
    }

    private void displayMenu() {
        System.out.println("Velkommen til SUPERHERO UNIVERSET.");
        System.out.println("1. Opret superhelt");
        System.out.println("5. Søg på en superhelt");
        System.out.println("6. Rediger en superhelt");
        System.out.println("7. Udskriv liste af superhelte i databasen");
        System.out.println("9. Afslut");
        System.out.print("Indtast dit valg: ");
    }

    private int getUserChoice() {
        return keyboard.nextInt();
    }

    private void createSuperhero() {
        System.out.print("Navn: ");
        String name = keyboard.next();
        keyboard.nextLine();

        System.out.print("Real name: ");
        String realName = keyboard.next();
        keyboard.nextLine();

        System.out.print("Super power: ");
        String superPower = keyboard.next();
        keyboard.nextLine();

        System.out.print("Year created: ");
        int yearCreated = keyboard.nextInt();

        System.out.print("Is human: ");
        String isHuman = keyboard.next();

        System.out.print("Strength: ");
        int strength = keyboard.nextInt();

        database.addSuperhero(name, realName, superPower, yearCreated, isHuman, strength);
    }

    private void searchSuperhero() {
        System.out.print("Indtast søgning: ");
        String searchName = keyboard.next();
        ArrayList<Superhero> matchingSuperheroes = database.searchSuperhero(searchName);

        if (matchingSuperheroes.isEmpty()) {
            System.out.println("Ingen matchende superhelte fundet.");
        } else {
            System.out.println("Matchende superhelte:");
            int count = 1;
            for (Superhero superhero : matchingSuperheroes) {
                System.out.println(count + ". " + superhero.getName());
                count++;
            }

            // Ask the user to choose a superhero from the list
            System.out.print("Vælg en superhelt (1-" + (count - 1) + "): ");
            int superheroChoice = keyboard.nextInt();
            if (superheroChoice >= 1 && superheroChoice < count) {
                Superhero selectedSuperhero = matchingSuperheroes.get(superheroChoice - 1);
                System.out.println("Du valgte: " + selectedSuperhero.getName());
                // You can perform additional actions with the selected superhero here.
                Superhero.displaySuperheroDetails(selectedSuperhero);

            } else {
                System.out.println("Ugyldigt valg.");
            }
        }
    }

    private void printSuperheroes() {
        System.out.println("Liste af superhelte");
        database.printSuperheroes();
    }

    private void exitProgram() {
        System.out.println("Afslutter programmet.");
        System.exit(0);
    }

    private void editSuperhero() {
        System.out.print("Indtast navnet på superhelten, du vil redigere: ");
        String name = keyboard.next();
        database.editSuperhero(name);
    }


}
