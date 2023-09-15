import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Database database = new Database();


        while (true) {
            System.out.println("Velkommen til SUPERHERO UNIVERSET.");
            System.out.println("1. Opret superhelt");
            System.out.println("5. Søg på en superhelt");
            System.out.println("7. Udskriv liste af superhelte i databasen");
            System.out.println("9. Afslut");
            System.out.print("Indtast dit valg: ");
            int choice = keyboard.nextInt();

            if (choice == 1) {
                // Code to add a new superhero (similar to your existing code)
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
