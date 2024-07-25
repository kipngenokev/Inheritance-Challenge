public class Main {
    public static void main(String[] args) {
       Employee kev= new Employee("Kev","12/03/2002","01/09/2020");
       System.out.println(kev);
        System.out.println("Age ="+kev.getAge());
        System.out.println("Pay ="+kev.collectPay());

        SalariedEmployee Fid= new SalariedEmployee("Fid","12/03/2000","01/09/2020",2110000);
        System.out.println(Fid);
        System.out.println("Fidel's paycheck = Ksh"+Fid.collectPay());

        HourlyEmployee Nancy= new HourlyEmployee("Nancy","01/04/1980","12/08/2007",2000);
        System.out.println(Nancy);
        System.out.println("Nancy's paycheck = Ksh"+Nancy.collectPay());
        System.out.println("Nancy's holiday pay = Ksh"+Nancy.getDoublePay());
    }
}