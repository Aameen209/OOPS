
import com.javatpoint.Student;
// Save this as test1.java
class Test1 { // Renamed to follow Java naming conventions (CamelCase)
    String color;
    String type;

    public void write() {
        System.out.println("writing something"); // Added missing semicolon
    }

    public void printcolor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    // public void printInfo() {
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    // }

    // Student(Student s2) {
    //     this.name = s2.name;
    //     this.age = s2.age;
    // }

    // Student() {

    // }

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + "  " + age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "aameen";
        s1.age = 19;

        s1.printInfo(s1.name,s1.age) ;
    }

}

