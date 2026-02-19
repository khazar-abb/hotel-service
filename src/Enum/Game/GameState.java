package Enum.Game;

public enum GameState {
    MENU(Action.START),
    PLAYING(Action.PAUSE, Action.QUIT),
    PAUSED(Action.RESUME, Action.QUIT),
    GAME_OVER();

    private Action[] allowedActions;

    GameState(Action... actions){
        this.allowedActions = actions;
    }

    public boolean isActionAllowed(Action action){
        for (Action allowed : allowedActions){
            if (allowed == action){
                return true;
            }
        }
        return false;
    }

    public enum Action {
        START,
        PAUSE,
        RESUME,
        QUIT;

    }


}
