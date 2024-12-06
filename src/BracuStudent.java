public class BracuStudent {
    public String studentName;
    public String location;
    public boolean passCheck = false;

    public BracuStudent(String s1, String s2){
        studentName = s1;
        location = s2;
    }

    public void getPass(){
        passCheck = true;
    }

    public void updateHome(String s){
        location = s;
    }

    public void showDetails(){
        System.out.println("Student Name: " + studentName + "\nLives in " + location);
        System.out.println("Have Bus Pass? " + passCheck);

    }
}
