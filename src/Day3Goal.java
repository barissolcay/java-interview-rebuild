import java.util.List;

public class Day3Goal {
    private int id;
    private String title;
    private int target;
    private List<Day3ProgressEntry> progressEntries;

    public Day3Goal(int id, List<Day3ProgressEntry> progressEntries, String title, int target) {
        this.id = id;
        this.progressEntries = progressEntries;
        this.title = title;
        this.target = target;
    }

    public int calculateProgress(){
        int total = 0;
        for (Day3ProgressEntry prog : this.progressEntries){
            total += prog.getAmount();
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getTarget() {
        return target;
    }
}
