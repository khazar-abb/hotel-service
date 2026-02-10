package AbstractionInheritancePolymorphism.EmployeeSalary;

import java.util.ArrayList;

public class Main {
     static void main() {
        ArrayList<Employee>employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("Mirco"));
        employees.add(new PartTimeEmployee("Fedor"));
        employees.add(new Freelancer("Conor"));

        for (Employee employee : employees){
            employee.calculateSalary();
        }
    }
}
