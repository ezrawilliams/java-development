package com.pluralsight;

public class StaticDemoDriver {
    public static void main(String[] args) {
        //Create a StaticDemo object:
        StaticDemo demo = new StaticDemo();
        /*
        Instance mean object or that class
         */
        // then I will access my INSTANCE variables using my instance:
        demo.nonStaticName= "Ezra";
        demo.nonStaticNum=100;
        //what if I now try to access the static ones?
        /*
        I can access static variables with the class name
         */
        StaticDemo.staticName="Static Demo";
        StaticDemo.staticNum=100;

        StaticDemo demo2 = new StaticDemo();
        demo2.nonStaticName= "Williams";
        demo2.nonStaticNum=200;

    }
}
