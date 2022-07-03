package Weekend1Assigments.Assignment1DatastructureOOPS.Q1;

import java.util.Objects;

class Person{
    int age;
    String name;
    long height;

    public Person(int age, String name, long height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    // Getters and Setters of all the fields
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, height);
    }
}

