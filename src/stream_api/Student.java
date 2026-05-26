package stream_api;

public class Student {
    private Integer id;
    private String name;
    private Boolean gender;
    private String className;

    public Student() {
    }

    public Student(Integer id, String name, Boolean gender, String className) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.className = className;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", className='" + className + '\'' +
                '}';
    }
}
