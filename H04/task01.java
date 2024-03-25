// Дан LinkedList с несколькими элементами разного типа. 
// В методе revert класса LLTasks реализуйте разворот этого 
// списка без использования встроенного функционала.

package H04;

import java.util.LinkedList;

class LLTasks {
    public void revertLL(LinkedList<Object> ll) {
        int size = ll.size();
        for (int i = 0; i < size / 2; i++) {
            Object temp = ll.get(i);
            ll.set(i, ll.get(size - i - 1));
            ll.set(size - i - 1, temp);
        }
    }
}

public class task01{ 
    public static void main(String[] args) { 
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        LLTasks answer = new LLTasks();
        System.out.println(ll);
        answer.revertLL(ll);
        System.out.println(ll);
    }
}