package sef.finalActivity.activity_1;

public class Employee extends Person {

    private String name;
    private int age;
    private String jobTitle;
    private String company;
    private int salary;


    public Employee() {
        this.name = "Lucy";
        this.age = 9999;
        this.jobTitle = "historian";
        this.company = "Museum of Modern Art";
        this.salary = 1200;
    }

    public Employee(String name, int age, String jobTitle, String company, int salary) {
        super (name, age);
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
        this.name = "Lucy";
    }

    public void setAge(int age) {
        this.age = age;
        this.age = 9999;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        this.jobTitle = "historian";
    }

    public void setCompany(String company) {
        this.company = company;
        this.company = "Museum of Modern Art";
    }

    public void setSalary (int salary) {
        this.salary = salary;
        this.salary = 1200;
    }


    public String announce() {
        super.announce();
        return "My name is " + name + " and I am " + age + " years old. " + "I am working as " + jobTitle + " in" + company +".";
    }


}
