package ru.geekbrains;

public class MyStack<T> {

    private MyLinkedList<T> stack;

    public MyStack(MyLinkedList<T> stack) {
        this.stack = stack;
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void push(T item){
        stack.insertFirst(item);
    }

    public T pop(){
        return stack.removeFirst();
    }

    public T peek(){
        return stack.getFirst();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "stack=" + stack +
                '}';
    }
}
