package inheritance;

public class MySuperClass {

    String mySuperString = "Super class string";
    String commonString = "super common string";

    public MySuperClass(String constructorString) {
        System.out.println("super class constructor");
        System.out.println(constructorString);
    }


    public void mySuperClassMethod() {
        System.out.println("Super Class Method");
    }

    public void commonMethod() {
        System.out.println("super common method");
    }

}
