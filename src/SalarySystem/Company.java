package SalarySystem;

public class Company {
    private Employee[] employees = new Employee[5];
    static int totalEmployees;

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                totalEmployees++;
                break;
            }
        }
    }

    public void listEmployee() {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employees) {
            sb.append(employee).append(" - ");
        }
        System.out.println(sb);
    }

}
