package demo_baitap_java8.bai4;

import java.util.List;
import java.util.function.Consumer;

public class DanhSachTenSV {
    public static void main(String[] args) {
        List<String> names = List.of(
            "Nguyễn Hùng Cường",
            "Đinh Văn Đoàn",
            "Ngô Tiến Dũng",
            "Lại Đức Doanh",
            "Nguyễn Trần Tâm"
        );

        Consumer<String> printName = System.out::println;

        names.forEach(printName);
    }
}
