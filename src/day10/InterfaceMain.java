package day10;

public class InterfaceMain implements InterfaceExample2 , InterfaceExample3 {
    public void m2(){                 // example of  multiple inheritance & interface concept
        System.out.println(b);
    }
    public void m1(){
        System.out.println(a);
    }
    public void m3(){
        System.out.println(c);
    }

    public static void main(String[] args) {

        InterfaceMain test = new InterfaceMain();
        test.m2();
        test.m1();
        test.m3();

        InterfaceExample2 test1= new InterfaceMain();
        test.m1();
        test1.m2();

    }
}
