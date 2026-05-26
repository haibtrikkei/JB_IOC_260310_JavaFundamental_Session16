package datetime_api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KieuNgayThang_Java8 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Hôm nay là: "+today);

        LocalDate birthday;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ngày sinh của bạn: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        birthday = LocalDate.parse(sc.nextLine(), formatter);
        System.out.println("Ngày sinh của bạn: "+birthday);
    }
}
