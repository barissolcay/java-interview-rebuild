import java.util.Collections;

public class Day4UserScore {
    String name;
    int score;

    public Day4UserScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " -> " + score;
    }
}
