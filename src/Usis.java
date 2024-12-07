public class Usis {
    public int totalAdvisee;
    public int countCourse;
    public Student[] arr1 = new Student[5];

    public Usis() {
        System.out.println("Usis is ready to use");
    }

    public void login(Student obj) {
        if (obj.email == null && obj.password == null) {
            System.out.println("Email and password need to be set.");
        }
        else {
            System.out.println("Login successful");
            obj.checkLogin = true;
        }
    }

    public void advising(Student obj) {
        if (obj.checkLogin == true) {
            System.out.println("You haven't selected any courses.");
        }
        else {
            System.out.println("Please login to advise courses!");
        }
    }

    public void advising(Student obj, String s1, String s2, String s3, String s4) {
        if (obj.checkLogin == true) {
            System.out.println("You need special approval to take more than 3 courses.");
        }
        else {
            System.out.println("Please login to advise courses!");
        }
    }

    public void advising(Student obj, String s1, String s2, String s3) {
        if (obj.checkLogin == true) {
            if (totalAdvisee < 5) {
                arr1[totalAdvisee] = obj;
                totalAdvisee++;

                obj.courses[obj.countCourse] = s1;
                obj.countCourse++;
                obj.courses[obj.countCourse] = s2;
                obj.countCourse++;
                obj.courses[obj.countCourse] = s3;
                obj.countCourse++;
                System.out.println("Advising successful!");
            }
        }
        else {
            System.out.println("Please login to advise courses!");
        }
    }

    public void allAdviseeInfo() {
        System.out.println("Total Advisee: " + totalAdvisee);
        for (int i = 0; i < totalAdvisee; i++) {
            System.out.println("Name: " + arr1[i].name + " ID: " + arr1[i].id);
            System.out.println("Department: " + arr1[i].dept + "\nAdvised Courses:");
            for (int j = 0; j < arr1[i].countCourse; j++) {
                System.out.print(arr1[i].courses[j] + " ");
            }
            System.out.println("\n==============");
        }
    }
}