package Encapsulation;

public class MyPrivateClass {

    private String str = "My String";

    private String getString(){
        return str;
    }

    public void setString(String str) {
        this.str = str;
    }

    private void MyMethod() {
        System.out.println("My method");
    }

    public void printMethod(){
        System.out.println(str);
    }







}
