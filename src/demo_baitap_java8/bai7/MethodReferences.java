package demo_baitap_java8.bai7;

import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        List<String> dsChuoi = List.of(
                "Việt Nam","Lào","Campuchia","Thái Lan","Myanmar","Philipine"
        );
        dsChuoi.forEach(System.out::println);
    }
}

/*
Cho danh sách tên. Sử dụng method reference để in từng tên ra màn hình.
 */