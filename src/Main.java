import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Database database = new Database();




        while (true) {
            System.out.println("Velkommen til SUPERHERO UNIVERSET.");
            System.out.println("1. Opret superhelt");
            System.out.println("9 Afslut");
            int valg = scanner.nextInt();

            if (valg == 1) {


                System.out.print("Navn: ");
                String name = scanner.next();

                System.out.print("Real name: ");
                String realName = scanner.next();

                System.out.print("Super power: ");
                String superPower = scanner.next();

                System.out.print("Year created: ");
                int yearCreated = scanner.nextInt();


                System.out.print("Is human: ");
                String isHuman = scanner.next();

                System.out.print("Strength: ");
                String strength = scanner.next();

                //String[] data = input.split(",");
                //String[] data = input.split(",");


                //String name = data[0].trim();
                //String realName = data[1].trim();
                //String superPower = data[2].trim();
                //String yearCreated = data[3].trim();
                //String isHuman = data[4].trim();
                //String strength = data[5].trim();

                database.addSuperhero(name, realName, superPower, yearCreated, isHuman, strength);
            }else if (valg == 9) {
                break;
            }


        }

        System.out.println("Superheroes in the database:");
        database.printSuperheroes();

        scanner.close();
    }

}
