import java.util.ArrayList;

public class Database {
    private ArrayList<Superhero> superheroes = new ArrayList<>();

    public void addSuperhero(String name, String realName, String superPower, int yearCreated, String isHuman, String strength)  {
        Superhero superhero = new Superhero(name, realName, superPower,yearCreated,isHuman,strength);
        superheroes.add(superhero);
    }

    public void printSuperheroes() {
        for (Superhero superhero : superheroes) {
            System.out.println(superhero);
            System.out.println();
        }
    }
}