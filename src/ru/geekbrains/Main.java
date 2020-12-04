package ru.geekbrains;

import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        // write your code here

        MyLinkedList<String> mll1 = new MyLinkedList<>();
        mll1.insertFirst("Maria");
        mll1.insertFirst("Katya");
        mll1.insertFirst("Luba");
        mll1.insertFirst("Tanya");


        System.out.println("Iter");
        System.out.println(mll1);
        while (mll1.iterator().hasNext()){
            System.out.println(mll1.iterator().next());
            mll1.iterator().remove();
            System.out.println(mll1);
        }
        System.out.println("mll " + mll1);


        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("Maria");
        mll.insertFirst("Katya");
        mll.insertFirst("Luba");
        mll.insertFirst("Tanya");

        System.out.println("ListIter Next");
        System.out.println(mll);
        ListIterator<String> listIterator = mll.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
            listIterator.add("MMM");
            System.out.println(mll);
            listIterator.set("aaa");
            System.out.println(mll);
            listIterator.remove();
            System.out.println(mll);
            System.out.println(listIterator.next());
            listIterator.add("YYY");
            System.out.println(mll);
            listIterator.remove();
            System.out.println(mll);
            System.out.println(listIterator.next());
            listIterator.remove();
            System.out.println(mll);
        }
        System.out.println("mll " + mll);


        MyLinkedList<String> mll2 = new MyLinkedList<>();
        mll2.insertFirst("Maria");
        mll2.insertFirst("Katya");
        mll2.insertFirst("Luba");
        mll2.insertFirst("Tanya");

        System.out.println("ListIter Previos");
        System.out.println(mll2);
        ListIterator<String> listIterator1 = mll2.listIterator();
        while (listIterator1.hasPrevious()) {
            System.out.println(listIterator1.previous());
            listIterator1.set("MMM");
            listIterator1.add("YYY");
            System.out.println(mll2);
            listIterator1.remove();
            System.out.println(mll2);
            System.out.println(listIterator1.previous());
            listIterator1.remove();
            System.out.println(mll2);
        }
        System.out.println("mll " + mll2);

        System.out.println("Задание №3.");

        MyLinkedList<String> mllStack = new MyLinkedList<>();
        mllStack.insertFirst("Maria");
        mllStack.insertFirst("Katya");
        mllStack.insertFirst("Luba");
        mllStack.insertFirst("Tanya");

        MyStack<String> stringMyStack = new MyStack<>(mllStack);
        System.out.println(stringMyStack);

        System.out.println(stringMyStack.pop());
        System.out.println(stringMyStack);
        System.out.println(stringMyStack.pop());
        System.out.println(stringMyStack);
        stringMyStack.push("Svetlana");
        System.out.println(stringMyStack);
        System.out.println(stringMyStack.peek());
    }
}
