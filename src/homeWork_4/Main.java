package homeWork_4;
//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(1);

        queue.enqueue(2);

        queue.enqueue(3);

        System.out.println(queue.dequeue()); // 1

        System.out.println(queue.first()); // 2

        System.out.println(queue.isEmpty()); // false
    }
}