import java.util.ArrayList;

public class Database {
    //private Superhero[]superheroes = new Superhero[20];
    private ArrayList<Superhero> superheroes = new ArrayList<>(20);


    public Database() {
        Superhero superhero1 = new Superhero("Batman", "kanikkehuske", "flagermus", 1980, "ja", 3000);
        Superhero superhero2 = new Superhero("superman", "kanikkehuske", "super", 1980, "ja", 4000);

        superheroes.add(superhero1);
        superheroes.add(superhero2);
    }


    public void addSuperhero(String name, String realName, String superPower, int yearCreated, String isHuman, int strength) {
        Superhero superhero = new Superhero(name, realName, superPower, yearCreated, isHuman, strength);
        superheroes.add(superhero);
    }

    public void printSuperheroes() {
        for (Superhero superhero : superheroes) {
            System.out.println(superhero);
            System.out.println();
        }
    }

    public ArrayList<Superhero> searchSuperhero(String name) {
        ArrayList<Superhero> matchingSuperheroes = new ArrayList<>();

        for (Superhero superhero : superheroes) {
            if (superhero.getName().toLowerCase().contains(name.toLowerCase())) {
                    matchingSuperheroes.add(superhero);

            }


        }
        return matchingSuperheroes;

    }

}









