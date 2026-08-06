import java.util.ArrayList;
import java.util.List;

public class Day3Main {
    public static void main(String[] args) {
        Day3ProgressEntry progEntry1 = new Day3ProgressEntry(12);
        Day3ProgressEntry progEntry2 = new Day3ProgressEntry(25);
        Day3ProgressEntry progEntry3 = new Day3ProgressEntry(40);

        List<Day3ProgressEntry> listProg1 = new ArrayList<>();
        listProg1.add(progEntry1);
        listProg1.add(progEntry2);
        listProg1.add(progEntry3);

        List<Day3ProgressEntry> listProg2 = new ArrayList<>();

        Day3Goal goal1 = new Day3Goal(1, listProg1, "Koşu", 100);
        Day3Goal goal2 = new Day3Goal(2, listProg2, "Yüzme", 200);

        List<Day3Goal> goals1 = List.of(goal1, goal2);

        Day3User user1 = new Day3User(goals1, "Baris" , 1);


        user1.ShowUsersGoal();

        int goal1Progress = goal1.calculateProgress();
        int goal2Progress = goal2.calculateProgress();

        System.out.println("Goal 1 için ilerleme: " + goal1Progress + " Goal 1 için Hedef: " + goal1.getTarget());
        System.out.println("Goal 2 için ilerleme: " + goal2Progress + " Goal 2 için Hedef: " + goal2.getTarget());
    }
}
