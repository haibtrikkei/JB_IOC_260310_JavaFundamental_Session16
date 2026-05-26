package demo_lambda_expression;

import java.util.List;

public class SuDungLambdaVoiCollection {
    public static void main(String[] args) {
        List<String> list = List.of("Cường","Nam","Tiến","Đức","Bình");

        System.out.println("Hiển thị ra tên của những người có từ 4 kí tự trở lên: ");

        long total = list.stream().filter(name -> name.length() > 3).count();
        System.out.println("Tổng số người có tên từ 4 kí tự trở lên: "+total);
        System.out.println("Đó là các tên: ");
        list.stream().forEach(a ->{
            if(a.length()>3){
                System.out.println(a);
            }
        });
//        show(list);
    }

//    static void show(List<String> list){
//        for(String name: list){
//            if(name.length()>3){
//                System.out.println(name);
//            }
//        }
//    }
}
