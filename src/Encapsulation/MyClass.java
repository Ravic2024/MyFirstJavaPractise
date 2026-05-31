package Encapsulation;

public class MyClass {


    static void main() {
        MyPrivateClass myPrivateClass = new MyPrivateClass();
        myPrivateClass.setString("my updated string");
        //System.out.println(myPrivateClass.getString());
        myPrivateClass.printMethod();
    }


}
