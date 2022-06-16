package com.syntax.class16;

public class AccessModifiersDemo1 {

    private String password="pass123";  //cannot access this private String outside this particular class
    int ssn=123456789; //default access is applied if none is specified.
                      // Can be accessed w/in any classes inside the package
    public String name="Bilal"; //Can be accessed anywhere inside this package, along with any other packages

    public static void main(String[] args) {
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();
        System.out.println(ac.password);
        System.out.println(ac.ssn);
        System.out.println(ac.name);
    }


}
