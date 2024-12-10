public class Teacher {
    public String name;
    public String ini;
    public String [] arr1= new String[3];
    public int count;
    public Teacher(String s1,String s2){
        name = s1;
        ini = s2;
        System.out.println("A new teacher has been created");
    }
    public void addCourse(Course a){  ///here, (Course a) means passing the reference of c1,c2,.... objects
        if(count<3){
            arr1[count] = a.courseName;   // a.courseName ---> location.variable  , just like variable calling through an object
            count++;
        }
    }
    public void printDetail(){
        System.out.println("Name: " + name + "\nInitial: "+ ini + "\nList of courses: ");
        for(int i =0; i<count; i++){
            System.out.println(arr1[i]);
        }
    }
}
