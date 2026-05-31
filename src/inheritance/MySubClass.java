package inheritance;

public class MySubClass extends MySuperClass{

    String mySubClassString = "sub class string";
    String commonString = "sub common string";

    public MySubClass(String constrcutorStr) {
        super(constrcutorStr);
        System.out.println("sub class constructor");
    }

    public void mySubClassMethod() {
        System.out.println("Sub Class Method");
    }

    public void commonMethod() {
        System.out.println("sub common method");
    }


    public void printCommonString(){
        System.out.println(commonString);
        System.out.println(super.commonString);
    }

    public void printCommonMethod(){
        commonMethod();
        super.commonMethod();
    }
}
