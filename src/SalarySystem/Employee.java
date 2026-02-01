package SalarySystem;

public class Employee {
    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percent){
        salary = salary + ((salary / 100) * percent);
    }

    public void printInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(" - ").append(name).append(" - ").append(salary);
        System.out.println(sb);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
