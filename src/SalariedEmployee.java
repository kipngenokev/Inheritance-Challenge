public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthdate, String hireDate, double annualSalary) {
        super(name, birthdate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
   public double collectPay(){
        double paycheck =annualSalary/26;
        double adjustedPay=(isRetired)?0.9*paycheck:paycheck;

        return (int) adjustedPay;
    }
    public void retire() {
        terminate("12/12/2022");
        isRetired=true;
    }
}
