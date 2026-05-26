package demo_default_method;

public interface StudentInterface {
    void getStudents();
    default void insertStudent(){
        System.out.println("Đã thêm 1 sinh viên vào database");
    }
    default void showInfo(){
        System.out.println("Thông tin sinh viên: ");
        System.out.println("Họ tên: Nguyễn Văn Cường");
        System.out.println("Giới tính: Nam");
        System.out.println("Ngày sinh: 21/12/2002");
        System.out.println("Quê quán: Ứng Hòa - Hà Nội");
    }

    static void methodStatic(){
        System.out.println("Đây là phương thức static");
    }
}
