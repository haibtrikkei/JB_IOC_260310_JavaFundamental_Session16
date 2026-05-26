package datetime_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KieuDateCu {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println("Ngày giờ hiện tại: "+today);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhập vào ngày sinh của bạn: ");
        Date birthday;
        Scanner sc = new Scanner(System.in);
        try {
            birthday = sdf.parse(sc.nextLine());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ngày sinh của bạn: "+birthday);
    }
}
