class Student{

    String name;
    int id;
    static String collegeName;
    static int totalNumStudents;

    // Static block executes when the class is loaded, which happens before any object creation or constructor execution
    static{
        collegeName = "AITS";
        System.out.println("Executing static block and set collegeName as : " + collegeName);
    }

    public void show(){
        System.out.println(name + " : " + id + " : " + collegeName);    // non-static methods can access static variables.
    }

    Student(){
        totalNumStudents++;
        System.out.println("Total Number of Students are " + totalNumStudents);

    }

}



public class StaticVariables{

    public static void main(String[] args){

        Student s1 = new Student();
        s1.name = "Rajesh";
        s1.id = 56;
        //s1.collegeName = "AITS";  we can access static variable with object but that is bad practice. we should access using class name.

        //Student.collegeName = "AITS";

        s1.show();

        Student s2 = new Student();
        s2.name = "Pavan";
        s2.id = 57;
        //s2.collegeName = "AITT";        // If we change static variable value in one place it will affect for all objects because static variables are shared among all objects.


        s2.show();

        
    }

}