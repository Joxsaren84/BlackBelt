package ru.joxaren.local_inner_class;

public class LocalInner2 {
    public static void main(String[] args) {

        class Addition implements Math2 {

            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }

        Addition addition = new Addition();
        System.out.println(addition.doOperation(5, 6));
    }
}

interface Math2{

    int doOperation(int a, int b);

}