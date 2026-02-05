package entities;

public class Employee {

    private String name;
    private double grosSalaray;

    public Employee() {
    }

    public Employee(String name, double grosSalaray) {
        this.name = name;
        this.grosSalaray = grosSalaray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrosSalaray() {
        return grosSalaray;
    }

    public void setGrosSalaray(double grosSalaray) {
        this.grosSalaray = grosSalaray;
    }
}
