public class Superhero {
    private String name;
    private String realName;
    private String superPower;
    private int yearCreated;
    private String isHuman;
    private int strength;


    public String getName(){
        return name;
    }

    public Superhero(String name, String realName, String superPower, int yearCreated, String isHuman, int strength) {
        this.name = name;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    
    public String toString() {
        return "Name: " + name + "\nAlias: " + realName + "\nPower: " + superPower+"\nYear: "+ yearCreated+"\nHuman?: "+isHuman+"\nStrength: "+strength;
    }
}
