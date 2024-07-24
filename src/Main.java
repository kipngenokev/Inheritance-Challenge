public class Main {
    public static void main(String[] args) {
       Employee kev= new Employee("Kev","12/03/2002","01/09/2020");
       System.out.println(kev);
        System.out.println("Age ="+kev.getAge());
        System.out.println("Pay ="+kev.collectPay());

        Employee Fid= new Employee("Fid","12/03/2000","01/09/2020");
        System.out.println(Fid);
    }
}