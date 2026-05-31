package MethodOverridding;

public class FullTime extends Employee {

    @Override
    int salary() {
        return base + 20000;
    }

    public static String designation() {
        return "developer";
    }

}
