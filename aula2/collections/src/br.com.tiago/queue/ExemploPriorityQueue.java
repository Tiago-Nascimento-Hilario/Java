import java.util.PriorityQueue;
import java.util.Queue;

//Possui ordenação natural
public class ExemploPriorityQueue {
    public static void main(String[] args) {
        Queue <String> queue = new PriorityQueue<String>();

        queue.add("Primeiro");
        queue.add("Segundo");
        queue.add("Terceiro");

        while (queue.size() != 0) {
            System.out.println(queue.remove());
        }
    }
}
