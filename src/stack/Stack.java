package stack;

import java.util.*;

public class Stack<E> {

    private final Deque<E> data = new ArrayDeque<>();

    public boolean isEmpty(){
        return data.isEmpty();
    }

    public void push(E e) {
        data.push(e);
    }

    public E pop() {
        return data.pop();
    }

    public void pushAll(Iterable<? extends E> source) {
        for(E e : source){
            push(e);
        }
    }

    public void popAll(Collection<? super E> destination) {
        while(!data.isEmpty()){
            destination.add(pop());
        }
    }
}
