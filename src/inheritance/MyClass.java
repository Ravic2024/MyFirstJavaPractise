package inheritance;

public class MyClass {


    static void main() {
        MySubClass mySubClass = new MySubClass("constructor string");
        System.out.println(mySubClass.mySuperString);
        mySubClass.mySuperClassMethod();
        System.out.println(mySubClass.mySubClassString);
        mySubClass.mySubClassMethod();
        mySubClass.printCommonString();
        mySubClass.printCommonMethod();
    }


}
