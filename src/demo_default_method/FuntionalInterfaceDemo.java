package demo_default_method;
@FunctionalInterface
public interface FuntionalInterfaceDemo {
    int show();

    default void function1(){
        System.out.println("Phương thức mặc định trong functional interface");
    }

    default void function2(){
        System.out.println("Phương thức mặc định 2 trong funtional interface");
    }
}
