package EmployeeSalary;

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String name){
        super(name);
    }

    @Override
    public void calculateSalary(){
        System.out.println(getName() + "'s salary: 2000 $ (full-time)");
    }

}
