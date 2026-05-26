package stream_api;

import java.util.List;

public class SapXepDanhSach {
    public static void main(String[] args) {
        List<Student> list = List.of(
            new Student(1,"Nguyễn Tiến Nam",true,"CNTT1"),
            new Student(2,"Bùi Thanh Bình",true,"CNTT1"),
            new Student(3,"Trịnh Thúy Hằng",false,"CNTT2"),
            new Student(4,"Lê Đức Anh",true,"CNTT2"),
            new Student(5,"Phạm Thị Hồng",false,"CNTT2")
        );

        List<Student> cntt2 = list.stream().filter(s -> s.getClassName().equals("CNTT2")).toList();
        cntt2.forEach(s -> System.out.println(s));

        System.out.println("Sắp xếp danh sách theo họ tên giảm dần: ");
        list.stream().sorted((s1,s2)->s1.getName().compareTo(s2.getName())).forEach(stu->{
            System.out.println(stu);
        });
    }
}
