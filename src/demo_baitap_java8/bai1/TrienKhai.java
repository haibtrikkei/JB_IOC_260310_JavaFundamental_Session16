package demo_baitap_java8.bai1;

public class TrienKhai {
    public static void main(String[] args) {
        Tong2So obj = (a,b)->a+b;
        System.out.println("Tổng 2 số nguyên: "+obj.cong(10,20));
    }
}
