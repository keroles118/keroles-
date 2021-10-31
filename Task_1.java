/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_1;

/**
 *
 * @author OWNER
 */
public class Task_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Person person = new Person("sh sa"), student = new Student("kero shehata"),
        employee = new Employee("g a"), faculty = new Faculty("Computer science"),
        staff = new Staff("fci team"), people[] = { person, student, employee, faculty, staff };
        for (Person x : people)
        System.out.println(x);
        
    }

   static class Person {
        String name, address, phoneNumber, email;

        Person(String n) {
        name = n;
        }

        @Override
        public String toString() {
        return "Person " + name;
        }
    }

   static class Student extends Person {
        Student(String n) {
        super(n);
        }

        enum Status {
        freshman, sophomore, junior, senior
        }

        Status classStatus;

        @Override
        public String toString() {
        return "Student " + name;
        }
    }

    static class Employee extends Person {
        Employee(String n) {
        super(n);
        }

        String office, hireDate;
        double salary;

        @Override
        public String toString() {
        return "Employee " + name;
        }
    }

    static class Faculty extends Employee {
        Faculty(String n) {
        super(n);
        }

        String officeHours, rank;

        @Override
        public String toString() {
        return "Faculty " + name;
        }
    }

    static class Staff extends Employee {
        Staff(String n) {
        super(n);
        }

        String title;

        @Override
        public String toString() {
        return "Staff " + name;
        }
    }
}

    

