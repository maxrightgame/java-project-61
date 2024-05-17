package hexlet.code;

public class Utils {
    public static int generateRandomNumber(int minBound, int maxBound) {
        return (int) (Math.random() * (maxBound - minBound) + minBound);
    }
}
