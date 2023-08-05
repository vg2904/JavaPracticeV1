package practice;

public class PracticeSheet {

    int emp_id;
    String emp_name;
    String dep;

    void empt(int id , String name , String dept ) {
        emp_id = id;
        emp_name = name;
        dep  = dept;
    }

    void display(){
        System.out.println(emp_id);
        System.out.println(emp_name);
        System.out.println(dep);
    }






}
