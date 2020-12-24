package com.company.InheritanceTestClass;

public class InheritanceHumanClass {
    static public class Human {
        public void sleep() {
            System.out.println("Human sleep..");
        }
    }
     static class Male extends Human {
        @Override
        public void sleep() {
            System.out.println("Male sleep..");
        }
    }
     static class Female extends Human {
        @Override
        public void sleep() {
            System.out.println("Female sleep..");
        }
    }
}
