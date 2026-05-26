package demo_baitap_java8.bai3;

import java.util.List;
import java.util.function.Predicate;

public class DanhSachSoNguyen {
    public static void main(String[] args) {
        List<Integer> list = List.of(
            2,6,3,4,6,2,54,6,8,5,7,8,6,8,4,7
        );

        System.out.println("Các số chẵn: ");
        Predicate<Integer> isEven = n->n%2==0;

        List<Integer> listEven = list.stream().filter(isEven).toList();
        System.out.println(listEven);
    }
}
