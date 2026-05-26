package demo_baitap_java8.bai6;

import java.util.List;
import java.util.function.Function;

public class ChuyenChuoiThanhDoDai {
    public static void main(String[] args) {
        Function<String, Integer> layDoDai = name -> name.length();

        List<String> dsChuoi = List.of(
          "Việt Nam","Lào","Campuchia","Thái Lan","Myanmar","Philipine"
        );

        dsChuoi.stream().map(layDoDai).forEach(System.out::println);
    }
}

/*
Cho danh sách chuỗi. Sử dụng Function<String, Integer> để chuyển mỗi chuỗi
thành độ dài của chuỗi đó.
 */