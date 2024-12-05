public class Student {
    public int id;
    public double cg;
    public String [] course;
    public int count;

    public Student(int id){
        this.id = id;
        System.out.println("A student with ID " + id + " has been created.");
    }
    public Student(int id , double cg){
        this.id = id;
        this.cg = cg;
        storeCG(cg);
        System.out.println("A student with ID: " + id + " and cgpa " + cg + " has ben created.");
    }
    public void storeCG(double cg){
        this.cg = cg;
        if(cg<3) {
            course = new String[3];
        }
        else if(cg>=3){
            course = new String[4];
        }
    }
    public void storeID(int id){
        this.id = id;
    }
    public void addCourse(String s){
        if(cg == 0){
            System.out.println("Failed to add " + s + "\nSet CG first");
        }
        else if(cg <3){
            if(count<3){
                course[count] = s;
                count++;
            }
            else{
                System.out.println("Failed to add" + s + "\nCG is low. Can't add more than 3 courses.");
            }
        }
        else if(cg>=3){
            if(count<4){
                course[count] = s;
                count++;
            }
            else{
                System.out.println("Falied to add " + s + "\nMaximum 4 courses allowed.");
            }
        }
    }
    public void addCourse(String [] arr){
        for(int i =0; i<arr.length; i++){
            addCourse(arr[i]);
        }
    }
    public void removeAllCourse(){
        if(cg>=3) {
            course = new String[4];
        }
        else if(cg<3){
            course = new String[3];
        }
        count =0;
    }
    public void showAdvisee() {
        System.out.println("Student ID: " + id + ", CGPA: " + cg);
        System.out.println("Added courses are: ");
        if (count != 0) {
            for (int i = 0; i < count; i++) {
                System.out.print(course[i] + " ");
            }
            System.out.println();
        }
        else{
            System.out.println("No courses added.");
        }
    }
}
