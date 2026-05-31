package test;

public class MyClass {
    //fields
    //constructors
    //methods
    int i; //non-static variables
    String str = "Hello World";
    public MyClass() {

    }

    static void main() {
        MyClass myClass = new MyClass();
        //System.out.println(myClass.initialize().i);
        myClass.stringCheck();
    }

    public void stringCheck() {
        str = str.concat(" !!");
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);
        /*str = str.substring(6);
        System.out.println(str);*/
        str = str.substring(6,11);
        System.out.println(str);
        String s = "5";
        int i  = Integer.parseInt(s);
        System.out.println(i);
        int j = 10;
        String strs = String.valueOf(j);
        System.out.println(strs);
    }

    public MyClass initialize() {
        i = 6;
        return this;
        //Because static method can't access the non- static variable
    }





}
