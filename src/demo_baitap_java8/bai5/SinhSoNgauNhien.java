package demo_baitap_java8.bai5;

import java.util.Random;
import java.util.function.Supplier;

public class SinhSoNgauNhien {
    public static void main(String[] args) {
        Random r = new Random();
        Supplier<Double> sinhso = ()->Math.random()*100;

        System.out.println("Số ngẫu nhiên: "+sinhso.get());
    }
}
