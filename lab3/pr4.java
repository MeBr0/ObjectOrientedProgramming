import java.util.Scanner;

class Person {
    String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return "Name: " + name; }
}

class Student extends Person {

    public Student() {
        super();
    }

    public Student(String name) {
        super(name);
    }

    public String getName() {
        System.out.println("Student Name: " + name);
        return name;
    }
}

class Employee extends Person {

    public Employee() {
        super();
    }

    public Employee(String name) {
        super(name);
    }

    public String getName() {
        System.out.println("Employee Name: " + name);
        return name;
    }
}

public class pr4 {

    public static void printInformation(Person p) {
        p.getName();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student student = new Student("Aza");
        Employee employee = new Employee("Rusya");

        Person ref = student;

        System.out.println(ref.getName());

        ref = employee;

        System.out.println(ref.getName());

        printInformation(student);
        printInformation(employee);



    }
}