package SalarySystem;

public class Main {
    static void main() {
        Employee employee_01 = new Employee(011, "rico", 100.00);
        Employee employee_02 = new Employee(021, "bingo", 200.00);
        Employee employee_03 = new Employee(031, "gigo", 300.00);

        employee_01.increaseSalary(50.00);
        employee_03.increaseSalary(10.00);

        Company company = new Company();
        company.addEmployee(employee_01);
        company.addEmployee(employee_02);
        company.addEmployee(employee_03);

        company.listEmployee();
    }
}