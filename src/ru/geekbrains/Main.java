package ru.geekbrains;

import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        MyLinkedList<String> mll = new MyLinkedList<>();
//        mll.insertFirst("Maria");
//        mll.insertFirst("Katya");
//        mll.insertFirst("Luba");
//        mll.insertFirst("Tanya");
//
//        System.out.println(mll);
//
//
//        while (mll.iterator().hasNext()){
//            mll.iterator().next();
//            mll.iterator().remove();
//            System.out.println(mll);
//        }
//
////        for (String s : mll) {
////            mll.iterator().remove();
////            System.out.println(mll);
////        }
//
////            System.out.println(mll.listIterator().next());
////            System.out.println(mll.listIterator().next());
////            mll.listIterator().remove();
//
//        System.out.println(mll);

        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("Maria");
        mll.insertFirst("Katya");
        mll.insertFirst("Luba");
        mll.insertFirst("Tanya");

        System.out.println(mll);
        ListIterator<String> listIterator = mll.listIterator();
//        while (listIterator.hasNext()) {
//            listIterator.next();
//            listIterator.remove();
//            System.out.println(mll);
//        }

        while (listIterator.hasPrevious()) {
            listIterator.previous();
            listIterator.remove();
            System.out.println(mll);
        }

//        System.out.println("Задание №3.");
//
//        MyLinkedList<String> mllStack = new MyLinkedList<>();
//        mllStack.insertFirst("Maria");
//        mllStack.insertFirst("Katya");
//        mllStack.insertFirst("Luba");
//        mllStack.insertFirst("Tanya");
//
//        MyStack<String> stringMyStack = new MyStack<>(mllStack);
//        System.out.println(stringMyStack);
//
//        System.out.println(stringMyStack.pop());
//        System.out.println(stringMyStack);
//        System.out.println(stringMyStack.pop());
//        System.out.println(stringMyStack);
//        stringMyStack.push("Svetlana");
//        System.out.println(stringMyStack);
//        System.out.println(stringMyStack.peek());
    }
}
