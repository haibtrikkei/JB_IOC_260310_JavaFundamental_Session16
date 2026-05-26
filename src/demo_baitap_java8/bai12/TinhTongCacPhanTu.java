package demo_baitap_java8.bai12;

import java.util.List;

public class TinhTongCacPhanTu {
    public static void main(String[] args) {
        List<Integer> list = List.of(
            2,4,6,7,4,6,7,8,8,4,7,8,9,5
        );

        int total = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Cách 1: Tổng là: "+total);

        //Cách 2 dùng với reduce:
        int sum = list.stream().reduce(0,(a,b)->a+b);
        System.out.println("Cách 2: Sử dụng reduce: "+sum);
    }
}

/*
Cho danh sách số nguyên. Sử dụng Stream để tính tổng các phần tử.
 */