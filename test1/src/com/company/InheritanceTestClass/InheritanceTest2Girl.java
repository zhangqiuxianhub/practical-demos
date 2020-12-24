package com.company.InheritanceTestClass;

public class InheritanceTest2Girl {
    public static class Girl {
        public void smile(){
            System.out.println("girl smile()...");
        }
    }
    static class MMGirl extends Girl{

        @Override
        public void smile() {

            System.out.println("MMirl smile sounds sweet...");
        }
        public void c(){
            System.out.println("MMirl c()...");
        }
    }
    static class Main{

        public static void main(String[] args) {

            Girl g1=new MMGirl(); //向上转型
            g1.smile();

            MMGirl mmg=(MMGirl)g1; //向下转型,编译和运行皆不会出错
            mmg.smile();
            mmg.c();

            Girl g2=new Girl();
        //    MMGirl mmg1=(MMGirl)g2; //不安全的向下转型,编译无错但会运行会出错
        //    mmg1.smile();
        //    mmg1.c();
            /*output:
             * MMirl smile sounds sweet...
             * MMirl smile sounds sweet...
             * MMirl c()...
             * Exception in thread "main" java.lang.ClassCastException: com.company.InheritanceTestClass.InheritanceTest2Girl$Girl
             * cannot be cast to com.company.InheritanceTestClass.InheritanceTest2Girl$MMGirl
             * at com.company.InheritanceTestClass.InheritanceTest2Girl$Main.main(InheritanceTest2Girl.java:32)
             */
            if(g2 instanceof MMGirl){
                MMGirl mmg1=(MMGirl)g2;
                mmg1.smile();
                mmg1.c();
            }

        }
    }
}
