public class Student{
    public String name;
    public String dept;
    public int id;
    public String email;
    public String password;
    public String [] courses = new String[6];
    public int countCourse;
    public Student(String s1, int n, String s2){
        name = s1;
        id = n;
        dept = s2;
        System.out.println("Student object is created");
    }
}