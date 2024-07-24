public class HourlyEmployee extends Worker{
    private double hourlyPayRate;

    public HourlyEmployee(String name,String birthdate,double hourlyPayRate){
        super(name,birthdate);
        this.hourlyPayRate=hourlyPayRate;
    }


    public double collectPay(int hoursOfWork) {
        return (hoursOfWork*hourlyPayRate);
    }
}
