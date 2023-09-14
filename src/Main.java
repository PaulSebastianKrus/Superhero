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
            System.out.println("9 Afslut");
            System.out.print("Indtast dit valg!: ");
            int valg = keyboard.nextInt();

            if (valg == 1) {
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
            } else if (valg == 7) {
                System.out.println("Liste af superhelte");
                database.printSuperheroes();
            } else if (valg == 5) {
                System.out.println("Indtast søgning");
                String searchName = keyboard.next();
                ArrayList<Superhero> matchingSuperheroes = database.searchSuperhero(searchName);

                if (matchingSuperheroes.isEmpty()) {
                    System.out.println("Ingen matchende superhelte fundet.");
                } else {
                    System.out.println("Matchende superhelte:");
                    for (Superhero superhero : matchingSuperheroes) {
                        System.out.println(superhero);
                    }
                }
            }
            else if (valg == 9) {
                break;
            }
        }

        keyboard.close();
    }
}
