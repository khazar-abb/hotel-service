package AbstractionInheritancePolymorphism.EmployeeSalary;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String name){
        super(name);
    }

    @Override
    public void calculateSalary(){
        System.out.println(getName() + "'s salary: Hourly payment. (part-time)");
    }

}
