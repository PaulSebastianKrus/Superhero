import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Database database = new Database();
        Database searchSuperhero = new Database();

        while (true) {

            System.out.println("Velkommen til SUPERHERO UNIVERSET.");
            System.out.println("1. Opret superhelt");
            System.out.println("5. Søg på en superhelt");
            System.out.println("7. Udskriv liste af superhelte i databasen");
            System.out.println("9 Afslut");
            System.out.println("Indtast dit valg!: ");
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
                /*while (!keyboard.hasNextInt()){
                    System.out.println("Du skal indtaste et tal");
                    keyboard.next();
                }
                */

                System.out.print("Is human: ");
                String isHuman = keyboard.next();

                System.out.print("Strength: ");
                int strength = keyboard.nextInt();

                //String[] data = input.split(",");
                //String[] data = input.split(",");


                //String name = data[0].trim();
                //String realName = data[1].trim();
                //String superPower = data[2].trim();
                //String yearCreated = data[3].trim();
                //String isHuman = data[4].trim();
                //String strength = data[5].trim();

                database.addSuperhero(name, realName, superPower, yearCreated, isHuman, strength);
            } else if (valg == 7) {
                //få den til at printe 2 navne hvis man indtaster det
                System.out.println("Liste af superhelte");
                database.printSuperheroes();
                break;
            } else if (valg == 5) ;{
                System.out.println("Indtast søgning");
                System.out.println(database.searchSuperhero(keyboard.next()));
                break;
            }


        }

        keyboard.close();
    }

}
