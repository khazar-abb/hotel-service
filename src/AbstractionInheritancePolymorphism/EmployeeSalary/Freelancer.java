package AbstractionInheritancePolymorphism.EmployeeSalary;

public class Freelancer extends Employee{

    public Freelancer(String name){
        super(name);
    }

    @Override
    public void calculateSalary(){
        System.out.println(getName() + "'s salary: Project-based salary. (freelancer)");
    }

}
