package demo_optional;

import java.util.Optional;

public class SuDungOptional {
    public static void main(String[] args) {
        Optional<String> name = Optional.empty();

        String name1 = null;
        if(name.isPresent()){
            System.out.println("name đang có giá trị");
        }else{
            System.out.println("name không có giá trị");
        }

//        System.out.println("Gọi hàm của name1: "+name1.toUpperCase());
        String upper = name.orElse("No value").toUpperCase();
        System.out.println("Chuyển thành chữ hoa: "+upper);
    }
}
