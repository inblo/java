// В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList с
// о следующими методами:
// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди

package H04;

import java.util.LinkedList;

class MyQueueInt {
    private LinkedList<Integer> elements = new LinkedList<>();

    public void enqueue(int element) {
        elements.add(element);
    }

    public int dequeue() {
        return elements.removeFirst();
    }

    public int first() {
        return elements.getFirst();
    }

    public LinkedList<Integer> getElements() {
        return elements;
    }
}

public class task02 {
    public static void main(String[] args) {
        MyQueueInt queue;
        queue = new MyQueueInt();

        if (args.length == 0) {
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}