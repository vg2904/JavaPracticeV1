package practice;

public class PracticeSheetMain {
    public static void main(String[] args) throws InterruptedException {

        practice1.a = 300;

        PracticeSheet obj1 = new PracticeSheet();
        obj1.b = 400;
        System.out.println(obj1.m1());
        System.out.println(obj1.m1(50));


        PracticeSheet obj2 = new PracticeSheet();
        obj1.b = 500;
        System.out.println(obj1.m1());
        System.out.println(obj1.m1(50));
    }
}
