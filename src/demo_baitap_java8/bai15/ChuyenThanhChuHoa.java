package demo_baitap_java8.bai15;

import java.util.List;

public class ChuyenThanhChuHoa {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Nguyễn Hùng Cường",
                "Đinh Văn Đoàn",
                "Ngô Tiến Dũng",
                "Lại Đức Doanh",
                "Nguyễn Trần Tâm"
        );

        List<String> uppers = names.stream().map(String::toUpperCase).toList();
        System.out.println(uppers);
    }
}
