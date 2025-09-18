package main;

public class Main {

    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator();
        System.out.println("---SUMA---");
        System.out.println(cal.sumar(5,4));

        System.out.println("---RESTA---");
        System.out.println(cal.restar(5,4));

        System.out.println("---MULTIPLICACIÓN---");
        System.out.println(cal.multiplicar(5,4));

        System.out.println("---DIVISIÓN---");
        System.out.println(cal.dividir(5,4));
    }


}
