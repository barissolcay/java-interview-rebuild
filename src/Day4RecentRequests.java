import java.util.ArrayDeque;

public class Day4RecentRequests {
    private ArrayDeque<String> requestQueue;

    public Day4RecentRequests(ArrayDeque<String> requestQueue) {
        this.requestQueue = requestQueue;
    }

    public void addRequest(String request){
        requestQueue.addLast(request);
        System.out.println(request + ", kuyruğun en sonuna eklendi.");
    }

    public void procesesQueue(){
        String islendi = requestQueue.peek();
        requestQueue.poll();
        System.out.println("Sıradaki istek işlendi ve kuyruktan çıkarıldı." + "İşlenen: " + islendi);
    }

    public void showNextInQueue(){
        String next = requestQueue.peek();
        System.out.println("Sıradaki istek: " + next);
    }
}
