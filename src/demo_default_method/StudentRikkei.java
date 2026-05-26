package demo_default_method;

public class StudentRikkei implements StudentInterface{
    @Override
    public void getStudents() {
        System.out.println("Danh sách sinh viên: ");
        System.out.println("..........");
    }

    @Override
    public void insertStudent() {
        System.out.println("Đã thêm sinh viên Rikkei Education vào database");
    }
}
