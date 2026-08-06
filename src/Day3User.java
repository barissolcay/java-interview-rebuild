import java.util.List;

public class Day3User {
    private int id;
    private String username;
    private List<Day3Goal> goals;

    public Day3User(List<Day3Goal> goals, String username, int id) {
        this.goals = goals;
        this.username = username;
        this.id = id;
    }

    public void ShowUsersGoal(){
        for (Day3Goal goal : this.goals){
            System.out.println("id: " + goal.getId() + ", title: " + goal.getTitle() + ", target: " + goal.getTarget());
        }
    }
}
