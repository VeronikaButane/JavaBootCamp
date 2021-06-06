package sef.finalActivity.activity_1;

public class Person {

    public String name;
    public int age;
    public int salary;


    public Person() {
        this.name = "Lucy";
        this.age = 9999;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = "Lucy";
    }

    public void setAge(int age) {
        this.age = 9999;
    }

    public String announce() {
        return "My name is " + name + " and I am " + age + " years old";
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
