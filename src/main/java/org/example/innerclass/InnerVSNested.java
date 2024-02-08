package org.example.innerclass;

class OuterClass {
    private final String outerMessage = "It is outer class";

    class InnerClass {
        public void displayInner() {
            System.out.println(outerMessage);
            System.out.println("It is inner class");
        }
    }

    static class NestedClass {
        public void displayNested() {
            System.out.println("It is nested class");
        }
    }
}

public class InnerVSNested {
    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.displayInner();


        OuterClass.NestedClass nestedObject = new OuterClass.NestedClass();
        nestedObject.displayNested();
    }
}

