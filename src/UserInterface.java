import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner keyboard = new Scanner(System.in);
    private Database database = new Database();

    public void startProgram() {
        while (true) {
            System.out.println("Velkommen til SUPERHERO UNIVERSET.");
            System.out.println("1. Opret superhelt");
            System.out.println("5. Søg på en superhelt");
            System.out.println("7. Udskriv liste af superhelte i databasen");
            System.out.println("9. Afslut");
            System.out.print("Indtast dit valg: ");
            int choice = keyboard.nextInt();

            if (choice == 1) {
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
            } else if (choice == 7) {
                System.out.println("Liste af superhelte");
                database.printSuperheroes();
            } else if (choice == 5) {
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
            } else if (choice == 9) {
                break;
            }
        }

        keyboard.close();
    }
}