package Enum.GameEnumSet;

import java.util.EnumSet;

public enum GameState {

    MENU(Action.START),
    PLAYING(Action.PAUSE, Action.QUIT),
    PAUSED(Action.RESUME, Action.QUIT),
    GAME_OVER(); // no actions allowed

    private final EnumSet<Action> allowedActions;

    GameState(Action... actions) {
        if (actions.length == 0) {
            this.allowedActions = EnumSet.noneOf(Action.class);
        } else {
            this.allowedActions = EnumSet.of(actions[0], actions);
        }
    }

    public boolean isActionAllowed(Action action) {
        return allowedActions.contains(action);
    }

    public enum Action {
        START,
        PAUSE,
        RESUME,
        QUIT
    }
}
