package demo_default_method;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        StudentInterface.methodStatic();

        StudentInterface obj = new StudentRikkei();
        obj.insertStudent();
        obj.getStudents();
        obj.showInfo();
    }
}
