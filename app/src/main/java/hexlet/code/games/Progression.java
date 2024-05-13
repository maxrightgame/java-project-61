package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void progressionGame() {

    }

    public static void generateQuestion() {
        int startNumber = (int) (Math.random()
                * Engine.PROGRESSIONGAME_MAX_NUMBER - Engine.PROGRESSIONGAME_MIN_NUMBER + 1)
                + Engine.PROGRESSIONGAME_MIN_NUMBER;

    }

    public static int generateLength() {
        return (int) (Math.random()
                * Engine.PROGRESSIONGAME_MAX_LENGTH - Engine.PROGRESSIONGAME_MIN_LENGTH + 1)
                + Engine.PROGRESSIONGAME_MIN_LENGTH;
    }
}
