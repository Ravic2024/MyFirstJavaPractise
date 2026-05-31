package MethodOverridding;

public class MyClass {


    static void main() {
        Employee e = new FullTime();
        System.out.println(e.salary());

        e = new Contractor();
        System.out.println(e.salary());

        System.out.println(Employee.designation());
        System.out.println(FullTime.designation());
        System.out.println(Contractor.designation());
    }
}
