public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthdate, String hireDate, double annualSalary) {
        super(name, birthdate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire(int age){
        if(age >40) {
            System.out.println("Retirement age is attained!");
        }
    }
}
