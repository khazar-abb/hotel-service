package Enum.Game;

public class Main {
    public static void main(String[] args) {
        for (GameState gameState : GameState.values()){
            for (GameState.Action action : GameState.Action.values()){
                System.out.println(gameState + " + " + action + " -> " + gameState.isActionAllowed(action));
            }
        }
    }
}
