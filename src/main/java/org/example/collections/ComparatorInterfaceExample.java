package org.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ComparatorInterfaceExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 25));

        students.sort(Comparator.comparing(Student::getAge));

        System.out.println("Students sorted by age (ascending):");
        students.forEach(System.out::println);

        students.sort(Comparator.comparing(Student::getAge).reversed());

        System.out.println("\nStudents sorted by age (descending):");
        students.forEach(System.out::println);

        students.sort(Comparator.comparingInt(s -> s.getName().length()));

        System.out.println("\nStudents sorted by name length:");
        students.forEach(System.out::println);
    }
}
