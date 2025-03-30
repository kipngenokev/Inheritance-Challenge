public class Main{
    public static void main(String[] args) {
        Employee sim = new Employee("Simon","14/02/1978","12/09/2021");
        System.out.println(sim);
        System.out.println("Age ="+sim.getAge());
        System.out.println("pay ="+sim.collectPay());

        SalariedEmployee nancy = new SalariedEmployee("Nancy","01/02/1980","18/01/2020",30000);
        System.out.println(nancy);
        System.out.println("Nancy's paycheck ="+ nancy.collectPay() );

        nancy.retire();
        System.out.println("Nancy's pension paycheck =$"+ nancy.collectPay());

        HourlyEmployee kipngeno = new HourlyEmployee("Kipngeno","12/03/2002","31/05/2025",30);
        System.out.println(kipngeno);
        System.out.println("Kipngeno's paycheck = $"+kipngeno.collectPay());
        System.out.println("Kipngeno's holiday pay = $"+kipngeno.getDoublePay());
    }
}