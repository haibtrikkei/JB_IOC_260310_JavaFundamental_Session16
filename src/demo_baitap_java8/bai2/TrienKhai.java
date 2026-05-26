package demo_baitap_java8.bai2;

public class TrienKhai {
    public static void main(String[] args) {
        Calculator obj;

        //Triển khai cộng 2 số
        obj = (a,b)->a+b;
        System.out.println("Tổng 2 số: "+obj.calculate(10,20));

        obj = (a,b)->a-b;
        System.out.println("Hiệu 2 số: "+obj.calculate(10,20));

        obj = (a,b)->a*b;
        System.out.println("Tích 2 số: "+obj.calculate(10,20));

        obj = (a,b)->1.0*a/b;
        System.out.println("Thương 2 số: "+obj.calculate(10,20));
    }
}
