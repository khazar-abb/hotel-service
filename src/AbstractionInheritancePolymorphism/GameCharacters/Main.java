package AbstractionInheritancePolymorphism.GameCharacters;

public class Main {
    static void main() {
        GameCharacters archer = new Archer();
        GameCharacters mage = new Mage();
        GameCharacters warrior = new Warrior();

        archer.attack();
        mage.attack();
        warrior.attack();
    }
}