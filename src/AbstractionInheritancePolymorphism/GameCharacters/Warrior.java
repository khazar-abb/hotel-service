package AbstractionInheritancePolymorphism.GameCharacters;

public class Warrior extends GameCharacters {
    @Override
    public void attack() {
        System.out.println("Warrior is attacking...");
    }
}
