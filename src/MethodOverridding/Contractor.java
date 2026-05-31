package MethodOverridding;

public class Contractor extends Employee{

    @Override
    int salary() {
        return base + 10000;
    }

    public static String designation() {
        return "Manager";
    }

}
