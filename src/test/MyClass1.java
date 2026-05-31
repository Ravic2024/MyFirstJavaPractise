package test;

public class MyClass1 {


    static void main() {
        MyClass1 myClass1 = new MyClass1();
        myClass1.myMethod();//Java by default create a default constructor which is empty. But, if you have one, it will call that
        //if you access non-static variable from a static method, we can't access it directly
    }


    public void myMethod() {

    }
}
