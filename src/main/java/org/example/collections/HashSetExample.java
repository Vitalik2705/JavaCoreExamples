package org.example.collections;

import java.util.HashSet;
import java.util.Objects;

class City {
    private String name;
    private String country;

    public City(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name) && Objects.equals(country, city.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }

    @Override
    public String toString() {
        return name + ", " + country;
    }
}

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<City> uniqueCities = new HashSet<>();

        uniqueCities.add(new City("Paris", "France"));
        uniqueCities.add(new City("New York", "USA"));
        uniqueCities.add(new City("Tokyo", "Japan"));
        uniqueCities.add(new City("Paris", "France"));

        System.out.println("Unique Cities:");
        for (City city : uniqueCities) {
            System.out.println(city);
        }

        City searchedCity = new City("New York", "USA");
        boolean containsCity = uniqueCities.contains(searchedCity);
        System.out.println("\nDoes HashSet contain " + searchedCity + "? " + containsCity);

        City cityToRemove = new City("Tokyo", "Japan");
        uniqueCities.remove(cityToRemove);

        System.out.println("\nUnique Cities after removal:");
        for (City city : uniqueCities) {
            System.out.println(city);
        }

        uniqueCities.clear();

        System.out.println("\nIs Unique Cities empty? " + uniqueCities.isEmpty());
    }
}
