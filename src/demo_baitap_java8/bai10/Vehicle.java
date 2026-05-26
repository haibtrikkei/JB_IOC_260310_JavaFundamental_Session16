package demo_baitap_java8.bai10;

public interface Vehicle {
    default void start(){
        System.out.println("Khởi động máy!!!");
    }
}
