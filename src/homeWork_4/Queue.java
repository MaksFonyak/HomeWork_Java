package homeWork_4;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue<E> {

    private LinkedList<E> list = new LinkedList<E>();


    public void enqueue(E item) {

        list.addLast(item);

    }


    public E dequeue() {

        if (isEmpty()) {

            throw new NoSuchElementException();

        }

        return list.removeFirst();

    }


    public E first() {

        if (isEmpty()) {

            throw new NoSuchElementException();

        }

        return list.getFirst();

    }


    public boolean isEmpty() {

        return list.isEmpty();

    }

}