package org.example.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}

public class EqualsHashcodeExample {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();

        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
        Person person3 = new Person("Alice", 25);

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        System.out.println("Number of persons in the set: " + personSet.size());
        System.out.println("Person 1 equals Person 3: " + person1.equals(person3));
    }
}

