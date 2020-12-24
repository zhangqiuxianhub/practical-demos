package com.company.InheritanceTestClass;

public class InheritanceClass {
    static public class Animal {

        public void eat(){
            System.out.println("animal eatting...");
        }
    }
    static class Bird extends Animal{

        public void eat(){
            System.out.println("bird eatting...");
        }

        public void fly(){

            System.out.println("bird flying...");
        }
    }
}
class Main{

    public static void main(String[] args) {

        InheritanceClass.Animal b = new InheritanceClass.Bird(); //向上转型
        b.eat();    //此处将调用子类的 eat() 方法。原因：b 实际指向的是 Bird 子类，故调用时会调用子类本身的方法。
        //! error: b.fly(); b虽指向子类对象，但此时丢失fly()方法
        dosleep(new InheritanceHumanClass.Male());
        dosleep(new InheritanceHumanClass.Female());
    }

    public static void dosleep(InheritanceHumanClass.Human h) {
        h.sleep();
    }
}
